package com.training.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class LoginPage extends BasePage{
	// WebDriver driver
	
		public LoginPage(WebDriver driver){
			super(driver);
			
			addobject("Username",By.id("username"));
			addobject("password",By.id("password"));
			addobject("Login",By.id("Login"));
			addobject("rememberme",By.name("rememberUn"));
			addobject("forgotpassword",By.id("forgot_password_link"));
			addobject("fpusername",By.id("un"));
			addobject("cn",(By.id("continue")));
			
		}
		
		
}
