package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class ContactsPage extends BasePage {
		public ContactsPage(WebDriver driver) {
			super(driver);
			
			addobject("contactstab",By.id("Contact_Tab"));
			addobject("newbtn",By.xpath("//input[@title='New']"));
			addobject("lastname",By.id("name_lastcon2"));
			addobject("compname",By.xpath("//*[@id=\"con4_lkwgt\"]/img"));
			addobject("contactiframe",By.id("resultsFrame"));
			addobject("accselect",By.xpath("//a[text()='Dakshin1']"));
			addobject("save",By.xpath("(//input[@title='Save'])[1]"));
			addobject("createnewview",By.xpath("//a[text()='Create New View']"));
			addobject("viewname",By.id("fname"));
			addobject("viewuniquename",By.id("devname"));
			addobject("viewsave",By.xpath("(//input[@title='Save'])[1]"));
			addobject("createnewviewdropdown",By.xpath("//select[@name=\"fcf\"]"));
			addobject("viewcontacts",By.xpath("//a[text()='Ramesh']"));
			addobject("viewcancel",By.xpath("(//input[@title='Cancel'])[1]"));
			addobject("accname",By.xpath("//*[@id=\"con4_lkwgt\"]/img"));
			addobject("gobtn",By.xpath("//input[@title='Go!']"));
			addobject("recent",By.xpath("//select[@title='Display Selection']"));
			
			

		}
}
