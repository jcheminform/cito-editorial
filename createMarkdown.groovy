// Copyright (c) 2018-2020  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

input = args[0]

bibliography = new HashMap<String,String>();
def bibLines = new File("references.dat").readLines()
bibLines.each { String line ->
  splitString = '=1. '; fields = []
  fields[0] = line.substring(0,line.indexOf(splitString))
  fields[1] = line.substring(line.indexOf(splitString)+splitString.length())
  bibliography.put(fields[0], fields[1])
}

bibnotes = new HashMap<String,String>();
bibLines = new File("references.bibnotes").readLines()
bibLines.each { String line ->
  splitString = ','; fields = []
  if (line.contains(splitString)) {
    fields[0] = line.substring(0,line.indexOf(splitString))
    fields[1] = line.substring(line.indexOf(splitString)+splitString.length())
    bibnotes.put(fields[0], fields[1])
  }
}


references = new HashMap<String,String>();
bibList = "";
refCounter = 0;
topicCounter = 0;

slashPos = input.lastIndexOf("/")
context = input.substring(slashPos+1, input.indexOf("."))

lines = new File(input).readLines()
lines.each { String line ->
  if (line.contains("<references/>")) {
    println bibList
  } else {
    while (line.contains(".i.md")) {
      line = line.replace(".i.md", ".md")
    }
    while (line.contains("<cite")) {
      citeStart = line.indexOf("<cite")
      citeEnd = line.indexOf("</cite>")
      citeXML = line.substring(citeStart, citeEnd+7)
      def instruction = new XmlSlurper().parseText(citeXML)
      cites = instruction.text()
      if (cites.isEmpty()) cites = "?"
      replacement = ""
      if (!references.containsKey(cites)) {
        refCounter++
        references.put(cites, "" + refCounter)
        bibList += "${refCounter}. <a name=\"citeref${refCounter}\"></a>"
        if (bibliography.get(cites) != null) {
          bibList += bibliography.get(cites)
        } else {
          bibList += "Missing"
        }
        if (bibnotes.get(cites) != null) {
          bibList += " **[cito:${bibnotes.get(cites)}]**"
        }
        bibList += "\n"
        replacement = "<a href=\"#citeref${refCounter}\">${refCounter}</a>"
      } else {
        existingCounter = Integer.valueOf(references.get(cites))
        replacement = "<a href=\"#citeref${existingCounter}\">${existingCounter}</a>"
      }
      line = line.substring(0, citeStart) + replacement + line.substring(citeEnd+7)
    }
    println line
  }
}
