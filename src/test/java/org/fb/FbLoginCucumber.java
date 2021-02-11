package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLoginCucumber {
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAKU\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}

	@Given("Enter the Url")
	public void enter_the_url() {
	    driver.get("https://www.facebook.com/");
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	    
	}

	@Then("validate and quit")
	public void validate_and_quit() {
		driver.findElement(By.name("login")).click();
	    driver.quit();
	    
	}
	
}
