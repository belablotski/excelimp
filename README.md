About
=====
Import data from Microsoft Excel files into Hadoop.

Built on top [Apache POI](http://poi.apache.org/) 
[Maven repository](http://mvnrepository.com/artifact/org.apache.poi)

Usage
-----

Configuration
-------------
There are two configuration files in src/main/resources:
* application.conf (excluded from repository - used for my local testing, has a priority on application.properties)
* application.properties (committed to GitHub)


TODO
====


Ideas
=====


Useful links
============
Parsing Excel data
* http://codereview.stackexchange.com/questions/81908/extracting-tuples-from-excel-sheet
* https://gist.github.com/tjdett/4735911

Manipulating HDFS files
* http://stackoverflow.com/questions/32095428/move-file-from-local-to-hdfs

Change log
==========
2015-10-02
----------
Adding configuration properties.

Publish repository on GitHub.

2015-09-30
----------
Groundwork: parsing Excel file.

