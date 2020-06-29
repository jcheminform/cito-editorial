SOURCES := editorial.i.md
TARGETS := editorial.md

all: editorial.pdf

references.bibnotes: findCitations.groovy ${SOURCES}
	@echo "Finding the citations"
	@groovy findCitations.groovy . | grep "^Q" | sort | uniq > references.bibnotes

references.qids: references.bibnotes
	@cat references.bibnotes | cut -d',' -f1 > references.qids

references.dat: references.qids references.js references.extra
	@nodejs references.js
	@cat references.extra >> references.dat

%.md : %.i.md createMarkdown.groovy references.dat
	@echo "Creating $@ ... "
	@groovy createMarkdown.groovy $< > $@

%.pdf : %.md
	pandoc -o $@ -f markdown -t html5 $<
