package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.training.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	 static PropertiesReader properties = new PropertiesReader();
	String browsername;
	String url;
	
	public  WebDriver  launchapplication() {
		driver = getDriver();
		url = properties.getProperties("url");
		driver.get(url);
		return driver;
	}
	public WebDriver getDriver() {
		properties= new PropertiesReader();
		 browsername= properties.getProperties("browser");
		
		 if(driver==null) {
			 if(browsername.equalsIgnoreCase("chrome")) {
				 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			 }
			 else if(browsername.equalsIgnoreCase("firefox")) {
				 WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			 }
		 }
		 
			
			 driver.manage().window().maximize();
			 return driver;
		
	
	}
/*
	public void closebrowser()
	{
		driver.close();
		driver=null;
	}
*/
}
