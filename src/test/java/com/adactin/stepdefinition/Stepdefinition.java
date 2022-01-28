package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.manger.PageObjectManger;
import com.adactin.pom.LoginPage;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Stepdefinition extends BaseClass{
	
	public static WebDriver driver = TestRunner.driver;
	//LoginPage lp = new LoginPage(driver);
	PageObjectManger pom = new PageObjectManger(driver);
	
	
	
	
	@Given("^user launch the application$")
	public void user_launch_the_application()    {
		getUrl("https://adactinhotelapp.com/");
	      
	     
	}
	
	
	@When("^user enters the valid username \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_username_in_the_username_field(String username) throws Throwable {
		 valueToElement(pom.getLp().getUserName(), username);
	}

	@When("^user enters the valid password \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_password_in_the_password_field(String password) {
	  valueToElement(pom.getLp().getPassWord(), password);
	}


	

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button()    {
		clickOnElement(pom.getLp().getLogin());
	      
	     
	}

	@Then("^user verify the homepage navigates to search hotel page$")
	public void user_verify_the_homepage_navigates_to_search_hotel_page()    {
	      
	     
	}


	
	
	

}
