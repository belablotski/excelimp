package com.beloblotskiy.excelimp.controller

import com.beloblotskiy.excelimp.common.Settings

/**
 * Driver class for loading Excel file into Hadoop
 * @author abelablotski
 */
object Driver {
  
  def main(args: Array[String]) = {
    println(s"Command line arguments [${args.length}]:")
    args foreach { x => println(x) }
    
    println(Settings.pathToCoreSiteXml)
    println(Settings.pathToHdfsSiteXml)
  }
  
}