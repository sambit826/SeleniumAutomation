package Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
   public static String getCellValue(String sheet , int row , int cell) throws Exception
   {
	   FileInputStream fis = new FileInputStream(excel_path);
   	XSSFWorkbook wb = new XSSFWorkbook(fis);
      String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
      return cellvalue;
   }
}
