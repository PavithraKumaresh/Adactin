package com.adactin.manger;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class PageObjectManger {
	
	public static WebDriver driver;
	
	
	
	private LoginPage lp;


	public PageObjectManger(WebDriver ldriver) {
		this.driver = ldriver;
	}


	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	
	
	
	

}
