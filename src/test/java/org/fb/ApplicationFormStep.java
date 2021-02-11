package org.fb;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationFormStep extends BaseClass {
    WebDriver driver;
    Pomclass pomm;
    
	
	@Given("Launch")
	public void launch() {
		driver =chromeBrowser();
		maxWindow();
		pomm=new Pomclass(driver);
	}

	@Given("Get the Url")
	public void get_the_url() {
		launchUrl("https://www.techlistic.com/p/selenium-practice-form.html");
	}

	@When("Enter Names")
	public void enter_names(DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		type(pomm.getFirst(), asMaps.get(0).get("FirstName"));
	   type(pomm.getLast(),asMaps.get(0).get("LastName"));
	    type(pomm.getDate(), asMaps.get(0).get("Date"));
	   
	}

	@When("Selet items")
	public void selet_items() {
		click(driver.findElement(By.id("sex-0")));
	    
	}

	@Then("Fill the date and commands")
	public void fill_the_date_and_commands() {
	    driver.quit();
	}
	
}
