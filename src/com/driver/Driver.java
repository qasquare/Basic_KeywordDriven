package com.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.operation.KeywordExecutor;

public class Driver {
	/**
	 * Main Driver method that will drive the execution
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		File file = new File(System.getProperty("user.dir") + "/TestSuites/FirstTestSuite.xls"); 
		KeywordExecutor executor = new KeywordExecutor();

		try {

			InputStream fis = new FileInputStream(file);

			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheet("Sheet1");
			HSSFRow row;
			
			String keywordData, locatorData, inputData;
			System.out.println(sheet.getLastRowNum());

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				row = sheet.getRow(i);

				keywordData = row.getCell(0, Row.CREATE_NULL_AS_BLANK).getStringCellValue();
				locatorData = row.getCell(1, Row.CREATE_NULL_AS_BLANK).getStringCellValue();
				inputData = row.getCell(2, Row.CREATE_NULL_AS_BLANK).getStringCellValue();
				executor.execute(driver, keywordData, locatorData, inputData);
			}
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}