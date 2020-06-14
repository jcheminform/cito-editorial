# Adoption of the Citation Typing by the Journal of Cheminformatics

Egon Willighagen, 0000-0001-7542-0286, Dept of Bioinformatics - BiGCaT, NUTRIM, Maastricht University

We cite other literature for many reasons. The reasons are normally positive: it supports a statement
we make in our article, the new work extends on earlier ides, or the cited paper outlines a method
or a data set we use. Sometimes, however, we cite an article differently. For example, because we
disagree with the conclusions from that article. 
Citations help us find more information about a concept, and allow individual journal article
to focus on the new content. Furthermore, they position the new work on its historical context
and citation analyses can point us to research articles we would otherwise not have discovered [REF].

Of course, citations have found additional uses that stem from the idea that articles that are
cited a lot may be important. Would we assume that all citations to an article are positive,
this is a logical conclusion. However, citations are not always positive. We can cite an article
because we disagree with the statements. For example, a 2011 paper in Science about the possible uptake
of arsenate ions in DNA has seen mostly disagreeing citations [<a href="#citeref1">1</a>].

Ten years ago, Shotton *et al.* published an ontology
that formalizes a hierachy of reasons: the Citation Typing Ontology (CiTO) [<a href="#citeref2">2</a>]. 
This ontology defines a citation as the act of citing some article. That allows one to make
statements about the citation, in a machine readable way. Using the CiTO we can say the
citation is neutral (*cito:citesAsAuthority*), positive (*cito:confirms*), or negative (*cito:disagreesWith*).
The ontology also allows us to indicate reuse of methods and software (*cito:usesMethodIn*) and data (*cito:usesDataFrom*).
This, of course, is closely related to recent efforts in data citation [<a href="#citeref3">3</a>]
and software citation [<a href="#citeref4">4</a>].



## References

1. <a name="citeref1"></a>Wolfe-Simon F, Blum JS, Kulp TR, Gordon GW, Hoeft SE, Pett-Ridge J, et al. A Bacterium That Can Grow by Using Arsenic Instead of Phosphorus. Science. 2010 Dec 2;332(6034):1163–6.  doi:[10.1126/SCIENCE.1197258](https://doi.org/10.1126/SCIENCE.1197258) ([Scholia](https://scholia.toolforge.org/doi/10.1126/SCIENCE.1197258))
2. <a name="citeref2"></a>Shotton D. CiTO, the Citation Typing Ontology. J Biomed Semantics. 2010;1 Suppl 1(Suppl 1):S6.  doi:[10.1186/2041-1480-1-S1-S6](https://doi.org/10.1186/2041-1480-1-S1-S6) ([Scholia](https://scholia.toolforge.org/doi/10.1186/2041-1480-1-S1-S6))
3. <a name="citeref3"></a>Brase J. DataCite - A Global Registration Agency for Research Data. 2009 Nov;  doi:[10.1109/COINFO.2009.66](https://doi.org/10.1109/COINFO.2009.66) ([Scholia](https://scholia.toolforge.org/doi/10.1109/COINFO.2009.66))
4. <a name="citeref4"></a>Smith AM, Katz DS, Niemeyer KE, Group FSCW. Software citation principles. Peroni S, editor. PeerJ Comput Sci [Internet]. 2016 Sep 19;2:e86. Available from: https://peerj.com/articles/cs-86.pdf doi:[10.7717/PEERJ-CS.86](https://doi.org/10.7717/PEERJ-CS.86) ([Scholia](https://scholia.toolforge.org/doi/10.7717/PEERJ-CS.86))

