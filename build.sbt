name := "Excel files to Hadoop import"

organization := "com.beloblotskiy"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

libraryDependencies += "org.apache.poi" % "poi" % "3.13"

libraryDependencies += "org.apache.poi" % "poi-ooxml" % "3.13"

libraryDependencies += "org.apache.poi" % "poi-ooxml-schemas" % "3.13"

libraryDependencies += "org.apache.poi" % "poi-scratchpad" % "3.13"

libraryDependencies += "org.apache.poi" % "poi-examples" % "3.13"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.6.0"

libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"

libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "2.6.0"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"

