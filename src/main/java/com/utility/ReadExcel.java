package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {

	public static Object[][] ExcelReader(String workbookName) {
		File file = new File(workbookName);
		InputStream fis;
		Object object[][] = null;
		try {

			fis = new FileInputStream(file);

			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheet("Sheet1");
			HSSFRow row;
			object = new Object[sheet.getLastRowNum()][6];

			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				row = sheet.getRow(i + 1);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					object[i][j] = row.getCell(j, Row.CREATE_NULL_AS_BLANK).toString();

				}
			}
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return object;
	}

}
