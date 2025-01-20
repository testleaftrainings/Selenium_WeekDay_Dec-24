package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheet {

	//step 4 retrain static keyword
	public static String[][] readExcel() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./excelSheet/CreatedLeadSheet.xlsx");

		XSSFSheet sheetValue = wb.getSheetAt(0);
		int rowcount = sheetValue.getLastRowNum();
		short cellcount = sheetValue.getRow(1).getLastCellNum();
		//step 1 
		String[][] data=new String[rowcount][cellcount];
		
		for (int i = 1; i <=rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String stringCellValue2 = sheetValue.getRow(i).getCell(j).getStringCellValue();
				//step 2
			data[i-1][j]=stringCellValue2;
			}	
		}
		wb.close();
		//step 3
		return data;
		
		
		
		
		
	}

}
