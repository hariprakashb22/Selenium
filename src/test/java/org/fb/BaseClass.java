package org.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	static WebDriver driver;
	static Actions a;
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAKU\\eclipse-workspace\\PbmFramework\\driver\\chromedriver.exe");
       driver=new ChromeDriver();	
       return driver;
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
    }
	public static void type(WebElement e,String value) {
		e.sendKeys(value);
    }
	public static void click(WebElement element) {
		element.click();

	}
	private void quit() {
		driver.quit();

	}
	
}

