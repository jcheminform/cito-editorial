SOURCES := editorial.i.md
TARGETS := editorial.md

all: editorial.md

references.qids: findCitations.groovy ${SOURCES}
	@echo "Finding the citations"
	@groovy findCitations.groovy . | grep "^Q" | sort | uniq > references.qids

references.dat: references.qids references.js
	@nodejs references.js

%.md : %.i.md createMarkdown.groovy references.dat
	@echo "Creating $@ ... "
	@groovy createMarkdown.groovy $< > $@
