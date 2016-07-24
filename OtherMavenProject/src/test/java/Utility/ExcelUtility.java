package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static Object[][] getWorksheetData(String filename, String sheetName)
	{
		
		FileInputStream f = new FileInputStream(new File(file));
		XSSFWorkbook workbook= new XSSFWorkbook(f);
		XSSFSheet sheet = workbook.getSheet("Record");
		sheet.getLastRowNum();
		
		
		
		return null;
		
	}

}
