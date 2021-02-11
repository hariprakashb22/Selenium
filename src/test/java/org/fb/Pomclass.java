package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
	WebDriver driver;
	public Pomclass (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="firstname")
	private WebElement first;
	
	@FindBy(name="lastname")
	private WebElement last;
	
	@FindBy(id="datepicker")
	private WebElement date;
	

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getDate() {
		return date;
	}
	}
	
 