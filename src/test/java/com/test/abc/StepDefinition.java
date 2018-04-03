package com.test.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition
{
	WebDriver driver = null;
	
	@Given("^Open chrome broswer and start facebook application$")
	public void open_chrome_broswer_and_start_facebook_application() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Selenium Browsers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://facebook.com");
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable
	{
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@And("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable
	{
		driver.findElement(By.id("pass")).sendKeys(arg1);
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^Login should fail$")
	public void login_should_fail() throws Throwable
	{
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110"))
		{
			System.out.println("Login failed. Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

}
