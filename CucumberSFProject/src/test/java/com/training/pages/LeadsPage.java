package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class LeadsPage extends  BasePage{
	public LeadsPage(WebDriver driver) {
		super(driver);
		addobject("leadstab",By.xpath("//a[@title='Leads Tab']"));
		addobject("leadsview",By.id("fcf"));
		addobject("userInfo",By.id("userNavLabel"));
		addobject("newbtn",By.xpath("//input[@title='New']"));
		addobject("logout",By.xpath("//a[@title='Logout']"));
		addobject("gobtn",By.xpath("//input[@title='Go!']"));
		addobject("lastname",By.id("name_lastlea2"));
		addobject("save",By.xpath("(//input[@title=\"Save\"])[1]"));
		addobject("compname",By.id("lea3"));
		
	}
	
	


}
