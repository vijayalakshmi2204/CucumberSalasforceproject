package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class OpportunitiesPage extends BasePage {
	public OpportunitiesPage(WebDriver driver)
	{
		super(driver);
		
		
		addobject("OpportunitiesTab",By.xpath("//a[@title='Opportunities Tab']"));
		addobject("Opportunitiesdropdown",By.id("fcf"));
		addobject("newbutton",By.xpath("//input[@value=' New ']"));
		addobject("oppname",By.id("opp3"));
		addobject("accountname",By.id("opp4_lkwgt"));
		addobject("accountsearchiframe",By.id("searchFrame"));
		addobject("typeaccount",By.id("lksrch"));
		addobject("gobtn",By.xpath("//input[@title='Go!']"));
		
		addobject("accountresultiframe",By.id("resultsFrame"));
		addobject("accountselect",By.xpath("//a[text()='Dakshin']"));
		addobject("oppclosedate",By.id("opp9"));
		addobject("date",By.xpath("//*[@id=\"calRow5\"]/td[6]"));
		addobject("stagedropdown",By.id("opp11"));
		addobject("Probability",By.id("opp12"));
		addobject("Primarycampaignwindow",By.id("opp17_lkwgt"));
		addobject("campaigniframe",By.id("resultsFrame"));
		addobject("selectcampaign",By.xpath("//a[text()='Campaign1']"));
		addobject("oppsave",By.xpath("(//input[@title='Save'])[1]"));
		
		addobject("opppipeline",By.xpath("//a[text()='Opportunity Pipeline']"));
		addobject("stuckopp",By.xpath("//a[text()='Stuck Opportunities']"));
		addobject("Intervaldropdown",By.id("quarter_q"));
		addobject("Includedropdown",By.id("open"));
		addobject("runreport",By.xpath("//input[@title='Run Report']"));

	
	}
}
