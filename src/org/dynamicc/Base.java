package org.dynamicc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\ProjectWorkspace\\Dynamicpth\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void loadurl(String url) {
		driver.get(url);
	}

	public static void btnclick(WebElement element) {
		element.click();
}
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}
	public static void sch(WebElement element) {
		element.click();
	}
	
	public static void gt(WebElement element, String name) {
		element.sendKeys(name);
	//	String d=name.getText();
		
	}
	public static void attribute1(WebElement element ) {
		String attribute1=element.getAttribute("value");
		System.out.println(attribute1);
	}
	public static void quitBrowser() {
		driver.quit();
	}
}