package com.beloblotskiy.excelimp.common

import com.typesafe.config.ConfigFactory

/**
 * Project-wide settings.
 * @author abelablotski
 */
object Settings {
  val conf = ConfigFactory.load()
  
  val pathToCoreSiteXml = conf.getString("excelimp.model.hdfs.core-site.xml")
  val pathToHdfsSiteXml = conf.getString("excelimp.model.hdfs.hdfs-site.xml")
}