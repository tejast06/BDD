package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Desktop\\selenium4\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com");
	}
	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm()
	{
		String title=driver.getTitle();
	    Assert.assertEquals("FreeCRM", title);
	    
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
		driver.findElement(By.id("username")).sendKeys("tejastoley");
		driver.findElement(By.id("password")).sendKeys("123456");
		
	    
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("button")).click();
	  
	}
	
	@Then("^then user is on home page$")
	public void user_is_on_home_page()  {
	    String homeTitle =driver.getTitle();
	    Assert.assertEquals("HomeCRM", homeTitle);
	}
	   
	
	
	
	
	
	
}
