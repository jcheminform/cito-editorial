// Copyright (c) 2011-2018  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// find all references to scripts
//
// it takes one optional argument, which is appended to the output

if (args.length == 0) {
  println "groovy findCitations.groovy <directory>"
  System.exit(0)
}

def folder = args[0]

def basedir = new File(folder)
files = basedir.listFiles().grep(~/.*.md$/)
files.each { file ->
  file.eachLine { line ->
    while (line.contains("<cite")) {
      citeStart = line.indexOf("<cite")
      citeEnd = line.indexOf("</cite>")
      citeXML = line.substring(citeStart, citeEnd+7)
      def instruction = new XmlSlurper().parseText(citeXML)
      if (instruction.@type != "") {
        println(instruction.text() + "," + instruction.@type)
      } else {
        println(instruction.text())
      }
      line = line.substring(0, citeStart) + line.substring(citeEnd+7)
    }
  }
}

