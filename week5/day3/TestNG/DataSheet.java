package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheet {

	//step 4 retrain static keyword
	public static String[][] readExcel(String filename) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./excelSheet/"+filename+".xlsx");

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
