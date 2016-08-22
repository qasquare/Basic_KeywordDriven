package com.operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestMethods {
	/**
	 * Method to CLICK on an Object
	 * @param driver
	 * @param locator
	 */
	public void click(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element != null) {
			element.click();
		} else {
			System.out.println("Element not available");
		}
	}
	/**
	 * Method to launch AUT Site
	 * @param driver
	 * @param URL
	 */
	public void openUrl(WebDriver driver, String URL) {
		driver.get(URL);
	}
	/**
	 * Method to enter some data inside textbox. text area
	 * @param driver
	 * @param locator
	 * @param inputData
	 */
	public void enterText(WebDriver driver, String locator, String inputData) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element != null) {
			element.sendKeys(inputData);
		} else {
			System.out.println("Element not available");
		}
	}
	/**
	 * Method to Verify if text is matching with expected text message
	 * @param driver
	 * @param locator
	 * @param textToVerify
	 */
	public void verifyText(WebDriver driver, String locator, String textToVerify) {

		WebElement element = driver.findElement(By.xpath(locator));
		if (element != null) {
			if (textToVerify.equalsIgnoreCase(element.getText())) {
				System.out.println("Text is matching");
			} else {
				System.out.println("Text is not matching");

			}
		} else {
			System.out.println("Element not available");
		}
	}

}
