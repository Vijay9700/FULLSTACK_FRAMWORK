package utilities;
/*
 * THIS CLASS IS USED TO READ THE DATA FROM EXCEL DYNAMICALLY
 */

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String readExcel(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		//get the object of excel file
		FileInputStream fis=new FileInputStream("./testdata/scriptdata.xlsx");
		//open excel/workbook in read mode
		Workbook workbook = WorkbookFactory.create(fis);
		//get the sheet control
		Sheet sheet = workbook.getSheet(sheetName);
		//get row control
		Row row = sheet.getRow(rowIndex);
		//get cell control
		Cell cell = row.getCell(cellIndex);
		//read the data
		String data = cell.getStringCellValue();
		return data;
	}
	

}
