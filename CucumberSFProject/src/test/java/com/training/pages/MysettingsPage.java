package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class MysettingsPage extends BasePage{
	public  MysettingsPage (WebDriver driver){
		super(driver);
		addobject("mysettingsfromusermenu",By.xpath( "//a[@title='My Settings']"));
		addobject("personallink",By.xpath( "//span[text()='Personal']"));
		addobject("loginhistory",By.id("LoginHistory_font"));
		addobject("csvfile",By.xpath( "//a[@href='/servlet/servlet.LoginHistory?id=005bm000007XvUv']"));
		addobject("DisplayAndLayout",By.id("DisplayAndLayout_font"));
		addobject("CustomizeTabs",By.xpath( "//span[text()='Customize My Tabs']"));
		addobject("CustomAppdropdown",By.id("p4"));
		addobject("availabletabsdropdown",By.id("duel_select_0"));
		addobject("add",By.xpath( "//img[@title='Add']"));
		addobject("DisplayAndLayoutsave",By.xpath( "//input[@type='submit' and @value=' Save ']"));
		
		addobject("email",By.id("EmailSetup_font"));
		addobject("EmailSettings",By.id("EmailSettings_font"));
		addobject("Emailname",By.id("sender_name"));
		addobject("Emailid",By.id("sender_email"));
		addobject("bccbutton",By.id("auto_bcc1"));
		addobject("emailsave",By.xpath( "//input[@value=' Save ']"));
		addobject("calrem",By.id("CalendarAndReminders_font"));
		addobject("activerem",By.id("Reminders_font"));
		addobject("opentestbutton",By.id("testbtn"));
		
}
}