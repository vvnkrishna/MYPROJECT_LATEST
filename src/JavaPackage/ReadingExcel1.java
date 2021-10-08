package JavaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static Logger logger;

	public static void main(String[] args) throws Exception {

		//logger = Logger.getLogger("MyProject new");
		PropertyConfigurator.configure("log4j.properties");

		File src = new File("D:\\Testing\\Array.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb1 = new XSSFWorkbook(fis);
		logger.debug(wb1);

		XSSFSheet sht = wb1.getSheet("Friends");

		System.out.println(sht.getSheetName());

		System.out.println(sht.getRow(0).getCell(0));

		//System.out.println(sht.getRow(0));

		System.out.println(sht.getRow(0).getCell(0).getStringCellValue());

		int rows = sht.getPhysicalNumberOfRows();
		System.out.println(rows);

		int exactrows = sht.getLastRowNum();

		System.out.println(exactrows);

		int columns = sht.getRow(1).getPhysicalNumberOfCells();
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
