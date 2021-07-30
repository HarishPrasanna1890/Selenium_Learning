package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	//Step 1: Setup the workbook
	XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
	//Step2: Get into the Worksheet
	XSSFSheet ws = wb.getSheet("Sheet1");
	//Step3: Get into the row
	XSSFRow row = ws.getRow(0);
	//Step 4: Get into the cell
	XSSFCell cell = row.getCell(0);
	//Step 5: To read the string data
	String StringCellValue = cell.getStringCellValue();
	System.out.println(StringCellValue);
	
	
	//Last step
	wb.close();
	
	
	
	}

}
