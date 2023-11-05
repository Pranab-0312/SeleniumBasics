package com.imit.Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("./data/Textdata.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			String data = sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(data);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
