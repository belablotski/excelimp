package com.beloblotskiy.excelimp.controller

import scala.io.Source
import org.junit.Test
import org.junit.Assert._
import java.io.ByteArrayInputStream
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.ss.usermodel.DateUtil
import scala.collection.JavaConversions._
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet
import com.beloblotskiy.excelimp.model.hdfs.HdfsOps

/**
 * @author abelablotski
 */
class DriverTest {
  @Test
  def test1ExcelDatatypes() = {

    val excelfile = getClass.getResourceAsStream("/datatypes.xlsx")
    val wb = new XSSFWorkbook(excelfile) // HSSFWorkbook(binary) -- XLS

    def getCellString(cell: Cell) = {
      cell.getCellType() match {
        case Cell.CELL_TYPE_NUMERIC =>
          (new DataFormatter()).formatCellValue(cell)
        case Cell.CELL_TYPE_STRING =>
          cell.getStringCellValue()
        case Cell.CELL_TYPE_FORMULA =>
          val evaluator = wb.getCreationHelper().createFormulaEvaluator()
          (new DataFormatter()).formatCellValue(cell, evaluator)
        case _ => ""
      }
    }

    def sheetToText(sheet: XSSFSheet) = {
      sheet.rowIterator.map(row => {
        row.cellIterator.map(getCellString).mkString("\t")
      }).mkString("\n")
    }

    println(sheetToText(wb.getSheetAt(wb.getFirstVisibleTab)))
    assertTrue("dummy", true)
    
    HdfsOps.put("", "")
  }
}