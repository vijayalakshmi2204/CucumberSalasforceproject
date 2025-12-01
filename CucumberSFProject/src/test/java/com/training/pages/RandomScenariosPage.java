package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class RandomScenariosPage extends BasePage {
	public  RandomScenariosPage(WebDriver driver) {
		super(driver);
		
		addobject("editprofileiframe",By.id("contactInfoContentId"));
		addobject("hometab",By.xpath(" //a[@title='Home Tab']"));
		addobject("profilename",By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		addobject("editprofile",By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		addobject("aboutbtn",By.xpath("//a[contains(text(),'About')]"));
		addobject("lastname",By.id("lastName"));
		addobject("savebtn",By.xpath("//input[@value='Save All']"));
		addobject("plustab",By.xpath("//img[@title=\"All Tabs\"]"));
		addobject("selecttabs",By.xpath("//option[@value='Campaign']"));
		addobject("removebtn",By.xpath("//img[@title='Remove']"));
		addobject("savebutton",By.xpath("//input[@value=' Save ']"));
		addobject("fouroclocklink",By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a"));
		addobject("customizetab",By.className("btnImportant"));
		addobject("subjectcomboicon",By.className("comboboxIcon"));
		addobject("otherslink",By.cssSelector("body > div.choicesBox.tertiaryPalette.brandSecondaryBrd > ul > li.listItem4 > a"));
		addobject("endtimefielddropdown",By.id("EndDateTime_time"));
		addobject("endtimeover",By.id("timePickerItem_38"));
		addobject("recurrence",By.id("IsRecurrence"));
		addobject("recurrenceenddatetextbox",By.id("RecurrenceEndDateOnly"));
		addobject("recurrenceenddate",By.xpath("//*[@id=\"calRow3\"]/td[3]"));
		addobject("save",By.xpath("(//input[@value=' Save '])[1]"));
		addobject("monthviewmouseover",By.xpath("//*[@id=\"bCalDiv\"]/div/div[2]/span[2]/a[3]/img"));
		addobject("homecurrentdatelink",By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		addobject("eightoclocklink",By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a"));
		addobject("endtimeover1",By.id("timePickerItem_42"));
		
		
		
		
		

	}

}
