package org.dynamicc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Filpktsmehds extends Base {
	public Filpktsmehds() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	@FindBy(xpath = "//body/div[2]/div/div/button")
	private List<WebElement> btnlgn;

	public List<WebElement> getBtnlgn() {
		return btnlgn;
	}

	@FindBy(xpath = "//body/div/div/div/div/div[2]/div[2]/form/div/div/input")
	private WebElement serch;

	public WebElement getSerch() {
		return serch;
	}

	@FindBy(xpath = "//body/div/div/div//div/div[2]/div[2]/form/div/button")
	private WebElement sechclk;

	public WebElement getSechclk() {
		return sechclk;
	}

	@FindBy(xpath = "//body/div/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[3]/div/div[1][1]")
	private WebElement attribute1;

	public WebElement getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(WebElement attribute1) {
		this.attribute1 = attribute1;
	}

	

}
