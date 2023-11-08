package com.imit.Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("./data/Textdata.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			int lastRowNumber = sheet.getLastRowNum();
			for(int i=0; i<=lastRowNumber; i++) {
				XSSFRow row = sheet.getRow(i);
				int lastCellNumber = row.getLastCellNum();
				for(int j=0; j<lastCellNumber; j++) {
					XSSFCell cell = row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
