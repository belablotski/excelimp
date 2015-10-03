package com.beloblotskiy.excelimp.model.hdfs

import java.nio.file.{Files => NioFiles, Paths => NioPaths}
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path
import org.apache.commons.io.IOUtils
import java.nio.file.{Files => NioFiles}
import java.nio.file.{Paths => NioPaths}
import com.beloblotskiy.excelimp.common.Settings

/**
 * HDFS utilities
 * @author v-abelablotski
 */
object HdfsOps {
  private val conf = new Configuration()
  conf.addResource(new Path(Settings.pathToCoreSiteXml))
  conf.addResource(new Path(Settings.pathToHdfsSiteXml))
  private val fs = FileSystem.get(conf)

  def put(localPath: String, remotePath: String) {
    val inStream = NioFiles.newInputStream(NioPaths.get("C:/temp/avbtmp", "a.txt"))
    try {
      //val outFileStream = fs.create(new Path("/tmp/a123321.txt"))
      val outFileStream = fs.create(new Path("/user/v-abelablotski/put_files_test/a123.txt"))
      try {
        IOUtils.copy(inStream, outFileStream)
      } finally {
        outFileStream.close
      }
    } finally {
      inStream.close()
    }
  }
  /*
   *   def removeFile(filename: String): Boolean = {
    val path = new Path(filename)
    fileSystem.delete(path, true)
  }

  def getFile(filename: String): InputStream = {
    val path = new Path(filename)
    fileSystem.open(path)
  }

  def createFolder(folderPath: String): Unit = {
    val path = new Path(folderPath)
    if (!fileSystem.exists(path)) {
      fileSystem.mkdirs(path)
    }
  }
  
   */
}