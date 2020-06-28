# Adoption of the Citation Typing Ontology by the Journal of Cheminformatics

Egon Willighagen, 0000-0001-7542-0286, Dept of Bioinformatics - BiGCaT, NUTRIM, Maastricht University

We cite other literature for many reasons. The reasons are normally positive: it supports a statement
we make in our article, the new work extends earlier ideas, or the cited paper outlines a method
or a dataset we use. Sometimes, however, we cite an article differently, such as when we
disagree with the conclusions from that article. 
Citations help us find more information about a concept and allow individual journal article
to focus on the new content. Furthermore, they position the new work in its historical context
and citation analyses can point us to research topics we would otherwise not have
thought of [<a href="#citeref1">1</a>].

Of course, citations have found additional uses that stem from the idea that articles that are
cited a lot may be important. If we assume that all citations to an article are positive,
this is a logical conclusion. However, citations are not always positive. We can cite an article
because we disagree with the statements. For example, a 2011 paper in Science about the possible uptake
of arsenate ions in DNA has seen mostly disagreeing citations [<a href="#citeref2">2</a>].
Then the article is important for a different reason.

This was picked up ten years ago, when Shotton *et al.* published an ontology
that formalizes a hierachy of reasons: the Citation Typing Ontology (CiTO) [<a href="#citeref3">3</a>]. 
This ontology defines a citation as the act of citing some article. That allows one to make
statements about the citation, in a machine readable way. Using the CiTO we can say the
citation is neutral (*cito:citesAsAuthority*), positive (*cito:confirms*), or negative (*cito:disagreesWith*).
The ontology also allows us to indicate reuse of methods and software (*cito:usesMethodIn*) and data (*cito:usesDataFrom*).
This, of course, is closely related to recent efforts in data citation [<a href="#citeref4">4</a>]
and software citation [<a href="#citeref5">5</a>].
The adoption of the CiTO, however, has so far not been wide in publishing. CiteULike [<a href="#citeref6">6</a>] was one of
the first tools that had support [<a href="#citeref7">7</a>]. It allowed users to create citations with CiTO typing
(see Figure&nbsp;1).

![](culcito.png) <br />
Figure&nbsp;1: Screenshot of CiteUlike showing the citation between two articles and that the reason is that
the citing article uses the method proposed in the cite article (*cito:usesMethodIn*).

# Adopting the CiTO

If the past 10 years has shown anything, it is that the activity of scholarly communication via journal articles is
not easily changed. Whether it is widespread adoption of data repository, minimal reporting standards, or
freely sharing citations, the interest is there, but the uptake is slow. The OpenCitations project
[<a href="#citeref8">8</a>,<a href="#citeref9">9</a>] and Initiative for Open Citations [<a href="#citeref10">10</a>]
show how hard it is to change the momentum. And while CiteULike introduced support for
the CiTO, other references managers have not (yet). A chicken-and-egg situation may be an underlying issue:
if there are no providers of CiTO annotation, why should tools that work with citations use it? And at the
same time, if there is no use of it, why invest effort to provide such annotation.

However, the *Journal of Cheminformatics* considers adoption important. For example, we may want to learn what
articles are using a method proposed in some article. We may want to see how data is reused, or we may
want to get warned that we are citing an article that has been refuted repeatedly.

Therefore, we are starting a pilot to roll out CiTO annotation in the *Journal of Cheminformatics*. We
take advantage here of the ability to add notes to *full form* (see [<a href="#citeref3">3</a>])
references in bibliographies. These are referred to as *bibnotes*.
The content of the note will be strictly formatted: it will use the syntax *[cito:usesMethodIn]*
and formatted in bold.
That is, the bibnote starts with the *[* character, followed by one of the CiTO types, and ending
with the *]* character. If you wish to provide more than one annotation, you can repeat this syntax,
separated by one or more spaces, for example: *[cito:usesMethodIn] [cito:citeAsAuthority]*.
By using this specific syntax, we introduce a level of machine readability such that this annotation can
be extracted with text mining approaches and used by downstream citation projects.

These bibnotes can be used to overwrite the default *cito:cites*. We currently encourage
authors interested in participating in this pilot to use the following CiTO types: *cito:citesAsDataSource*
when you use data in your paper from the cited source, *cito:usesMethodIn* when you use a method
from the cites source, *cito:citesAsAuthority* for articles that you cite as authorative works
in the field, *cito:discusses* when you discuss the content of the cited article, and
*cito:extends* when your article describes a new realease of software or database described
in the cited article. However, you are free to use any of the other CiTO types, including
*cito:agreesWith* and *cito:disagreesWith*.

We also plan to adopt this approach for comments (*cito:repliesTo*) and errata/corrigenda/corrections (*cito:updates*).
These annotations will be handled at an editorial level.

With this pilot we hope to trigger further adoption of approaches like CiTO. We plan 
to use this information in Wikicite [<a href="#citeref11">11</a>] and Scholia [<a href="#citeref12">12</a>]
to demonstrate downstream use,
but hope that projects like OpenCitations and SciGraph
([www.springernature.com/gp/researchers/scigraph](https://www.springernature.com/gp/researchers/scigraph))
will pick it up too.
During the pilot, we will also develop practical guidance on how to use reference managers
and type setting tools like Microsoft Word and LaTeX can be used to add these annotations.

Let this be the egg or chicken (depending on your philosophy) we are looking to innovate
how we cite our literature.

## Acknowledgments

Thanks to Emma Schymanski, Rajarshi Guha, Nina Jeliazkova, Matthew Smyllie, and Silvio Peroni for feedback.

## References

1. <a name="citeref1"></a>Agarwal P, Searls DB. Can literature analysis identify innovation drivers in drug discovery? Nat Rev Drug Discov. 2009 Nov 1;8(11):865–78.  doi:[10.1038/NRD2973](https://doi.org/10.1038/NRD2973) ([Scholia](https://scholia.toolforge.org/doi/10.1038/NRD2973))
2. <a name="citeref2"></a>Wolfe-Simon F, Blum JS, Kulp TR, Gordon GW, Hoeft SE, Pett-Ridge J, et al. A Bacterium That Can Grow by Using Arsenic Instead of Phosphorus. Science. 2010 Dec 2;332(6034):1163–6.  doi:[10.1126/SCIENCE.1197258](https://doi.org/10.1126/SCIENCE.1197258) ([Scholia](https://scholia.toolforge.org/doi/10.1126/SCIENCE.1197258))
3. <a name="citeref3"></a>Peroni S, Shotton D. FaBiO and CiTO: Ontologies for describing bibliographic resources and citations. Journal of Web Semantics. 2012 Dec;17:33–43.  doi:[10.1016/J.WEBSEM.2012.08.001](https://doi.org/10.1016/J.WEBSEM.2012.08.001) ([Scholia](https://scholia.toolforge.org/doi/10.1016/J.WEBSEM.2012.08.001)) **[cito:usesMethodIn]**
4. <a name="citeref4"></a>Brase J. DataCite - A Global Registration Agency for Research Data. 2009 Nov;  doi:[10.1109/COINFO.2009.66](https://doi.org/10.1109/COINFO.2009.66) ([Scholia](https://scholia.toolforge.org/doi/10.1109/COINFO.2009.66))
5. <a name="citeref5"></a>Smith AM, Katz DS, Niemeyer KE, Group FSCW. Software citation principles. Peroni S, editor. PeerJ Comput Sci. 2016 Sep 19;2:e86.  doi:[10.7717/PEERJ-CS.86](https://doi.org/10.7717/PEERJ-CS.86) ([Scholia](https://scholia.toolforge.org/doi/10.7717/PEERJ-CS.86))
6. <a name="citeref6"></a>McMullen A. CiteULike. Public Services Quarterly. 2010 Nov 9;6(4):368–9.  doi:[10.1080/15228951003772595](https://doi.org/10.1080/15228951003772595) ([Scholia](https://scholia.toolforge.org/doi/10.1080/15228951003772595)) **[cito:citesAsAuthority]**
7. <a name="citeref7"></a>E.L. Willighagen, CiTO / CiteULike: publishing innovation, 2012, chem-bla-ics, https://chem-bla-ics.blogspot.com/2012/02/cito-citeulike-publishing-innovation.html
8. <a name="citeref8"></a>Shotton D. Publishing: Open citations. Nature. 2013 Oct 1;502(7471):295–7.  doi:[10.1038/502295A](https://doi.org/10.1038/502295A) ([Scholia](https://scholia.toolforge.org/doi/10.1038/502295A))
9. <a name="citeref9"></a>Peroni S, Shotton D. OpenCitations, an infrastructure organization for open scholarship. Quantitative Science Studies. 2020 Feb;1(1):428–44.  doi:[10.1162/QSS_A_00023](https://doi.org/10.1162/QSS_A_00023) ([Scholia](https://scholia.toolforge.org/doi/10.1162/QSS_A_00023)) **[cito:citesAsAuthority]**
10. <a name="citeref10"></a>Schiermeier Q. Initiative aims to break science’s citation paywall. Nature. 2017 Apr 6;  doi:[10.1038/NATURE.2017.21800](https://doi.org/10.1038/NATURE.2017.21800) ([Scholia](https://scholia.toolforge.org/doi/10.1038/NATURE.2017.21800)) **[cito:citesForInformation]**
11. <a name="citeref11"></a>Taraborelli D, Dugan JM, Pintscher L, Mietchen D, Neylon C. WikiCite 2016 Report. Wikimedia Commons. 2016 Nov.  doi:[10.6084/M9.FIGSHARE.4042530](https://doi.org/10.6084/M9.FIGSHARE.4042530) ([Scholia](https://scholia.toolforge.org/doi/10.6084/M9.FIGSHARE.4042530))
12. <a name="citeref12"></a>Nielsen FÅ, Mietchen D, Willighagen E. Scholia, Scientometrics and Wikidata. In: The Semantic Web: ESWC 2017 Satellite Events. 2017. p. 237–59.  doi:[10.1007/978-3-319-70407-4_36](https://doi.org/10.1007/978-3-319-70407-4_36) ([Scholia](https://scholia.toolforge.org/doi/10.1007/978-3-319-70407-4_36)) **[cito:citesAsAuthority]**

