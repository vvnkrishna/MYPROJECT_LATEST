package JavaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class REadingExcel2 {
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		File src = new File("D:\\Testing\\Array1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sht = wb.getSheet("Friends");
		System.out.println(wb);
		
		
		System.out.println(sht.getSheetName());
		
		int rows = sht.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		/*
		 * int exrow = sht.getLastRowNum();
		 *  System.out.println(exrow);
		 */
		
		
		int coloumn = sht.getRow(1).getPhysicalNumberOfCells();
		System.out.println(coloumn);
		
		/*
		 * int col2 = sht.getRow(1).getLastCellNum();
		 *  System.out.println(col2);
		 */
		
		
		for(int i = 0; i < rows; i++ ) {
			
			for(int j = 0 ; j < coloumn; j++) {
				
				
				//Cell cell1 = sht.getRow(i).getCell(j);
				String s = new DataFormatter().formatCellValue(sht.getRow(i).getCell(j));
				
				//String s = String.valueOf(sht.getRow(i).getCell(j).getNumericCellValue());
				//String s = sht.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print("   "+ s+"   ");
				System.out.print("|");
			}
			
			System.out.println();
			
		}
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
