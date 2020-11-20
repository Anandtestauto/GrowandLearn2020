package ExcelData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// to get in to workbook

		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");

		//// to get in to worksheet

		XSSFSheet sheet = wb.getSheet("Sheet1");

		// XSSFSheet sheet1=wb.getSheetAt(0);

//		// to get in to row
//		XSSFRow row=sheet.getRow(0);
//		
//		// to get in to row
//		XSSFCell cell = row.getCell(0);
//		
//		// to get the value from cell value
//		String   CellValue = cell.getStringCellValue();
//		
//		System.out.println(CellValue);
		
		
		
		// to get the no of rows
		
		int lastRowNum = sheet.getLastRowNum();
		
		System.out.println(lastRowNum);
		
		// to get the no of rows including header
		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(physicalNumberOfRows);
//		
		
		// to get no of cells
		
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println(lastCellNum);
	
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
 
				String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(CellValue);
			}
		}

		wb.close();

	}

}
