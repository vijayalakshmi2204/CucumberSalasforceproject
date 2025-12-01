package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class AccountPage extends BasePage{
	public AccountPage(WebDriver driver) {
		super(driver); 
		
		addobject("accounttab",By.xpath("//a[@title='Accounts Tab']"));
		addobject("newbutton",By.xpath(("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")));
		addobject("AccountName",By.id("acc2"));
		addobject("Typedropdown",By.id("acc6"));
		addobject("CustomerPrioritydropdown",By.id("00Nbm000006TGZP"));
		addobject("accsave",By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		addobject("createnewview",By.xpath("//a[contains(text(),'Create New View')]"));
		addobject("ViewName",By.id("fname"));
		addobject("ViewUniqueName",By.id("devname"));
		addobject("viewsave",By.xpath(("(//input[@title='Save'])")));
		addobject("viewdropdown",By.id("fcf"));
		addobject("editview",By.xpath("//a[text()='Edit']"));
		addobject("fielddropdown",By.id("fcol1"));
		addobject("operatordropdown",By.id("fop1"));
		addobject("value",By.id("fval1"));
		addobject("save",By.xpath("(//input[@value=' Save '])[1]"));
		addobject("MergeAccountslink",By.xpath("//a[text()='Merge Accounts']"));
		addobject("findAccountstextbox",By.id("srch"));
		addobject("findAccountsbutton",By.xpath("//input[@value='Find Accounts']"));
		addobject("account1chk",By.id("cid1"));
		addobject("account2chk",By.id("cid2"));
		addobject("next",By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[1]"));
		addobject("mergebtn",By.xpath("(//input[@title='Merge'])[1]"));
		addobject("createreport",By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		addobject("createfield",By.id("ext-gen148"));
		addobject("createdate",By.xpath("//div[text()='Created Date']"));
		addobject("fromdate",By.xpath("//*[@id=\"ext-gen152\"]"));
		addobject("fromdatetoday",By.xpath("(//button[contains(text(),'Today')])[1]"));
		addobject("todate",By.xpath("//*[@id=\"ext-gen154\"]"));
		addobject("todatetoday",By.xpath("(//button[contains(text(),'Today')])[2]"));
		addobject("unsavedreportsave",By.id("ext-gen49"));
		addobject("reportname",By.id("saveReportDlg_reportNameField"));
		addobject("uniquereportname",By.id("saveReportDlg_DeveloperName"));
		addobject("saveandrunreport",By.id("ext-gen316"));
	
	
	
	
	
	
	}


}
