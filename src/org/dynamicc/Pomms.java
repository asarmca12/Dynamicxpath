package org.dynamicc;

import org.openqa.selenium.WebDriver;

public class Pomms extends Base {
	public static void main(String[] args) {
		WebDriver driver = getDriver();
		loadurl("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Filpktsmehds pag1 = new Filpktsmehds();
		btnclick(pag1.getBtnlgn().get(0));
		type(pag1.getSerch(), "redmi note 7 pro");
		sch(pag1.getSechclk());

		attribute1(pag1.getAttribute1());
	}
}
