package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.properties.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//Adactin.feature",
glue = "com\\adactin\\stepdefinition")


public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		 driver = BaseClass.browserLaunch(browser);
		
	}
	
	

}
