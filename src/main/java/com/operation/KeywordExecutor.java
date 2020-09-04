package com.operation;

import org.openqa.selenium.WebDriver;

public class KeywordExecutor {
	
	TestMethods tests = new TestMethods(); //Creating object of a TestMethod class	
	
	/**
	 * This method will execute the test methods according to the keyword provided
	 * @param keywordData
	 * @param locatorData
	 * @param inputData
	 */
	
	public void execute(WebDriver driver, String keywordData, String locatorData, String inputData){
		switch (keywordData) {
		case "OpenWebsite":
			tests.openUrl(driver, inputData);
			break;
		case "EnterText":
			tests.enterText(driver,locatorData, inputData);
			break;
		case "Click":
			tests.click(driver,locatorData);
			break;
		case "VerifyText":
			tests.verifyText(driver,locatorData, inputData);
			break;
		default:
			System.out.println("Invalid Keyword");
			break;
		}
		

	}
}
