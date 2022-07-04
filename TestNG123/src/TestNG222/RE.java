package TestNG222;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class RE {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("test.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		
		for (int  i= 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				
				Cell cell = sheet.getCell(i, j);
				String eleData = cell.getContents();
				
				System.out.println(eleData);
			}
			
		}
		
		
	}

}
