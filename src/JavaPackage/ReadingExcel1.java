package JavaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception {

		File src = new File("D:\\Testing\\Array.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sht = wb.getSheet("Friends");

		System.out.println(sht.getSheetName());

		System.out.println(sht.getRow(0).getCell(1));

		int rows = sht.getPhysicalNumberOfRows();
		System.out.println(rows);

		int columns = sht.getRow(0).getLastCellNum();
		System.out.println(columns);

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				String s = sht.getRow(i).getCell(j).getStringCellValue();

				String x = "--------";
				System.out.print(s);
				j++;
				String z = sht.getRow(i).getCell(j).getStringCellValue();
				System.out.println(x + z);

			}

		}

	}

}
