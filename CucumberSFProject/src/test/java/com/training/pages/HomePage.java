package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class HomePage extends BasePage {
	
	public  HomePage(WebDriver driver){
		super(driver);
		addobject("profile",By.id("userNavLabel"));
		addobject("logout",By.xpath("//a[@title='Logout']"));
		addobject("myprofile",By.xpath( "//a[@title='My Profile']"));
		addobject("myprofile",By.xpath( "//a[@title='My Profile']"));
		addobject("editcontact",By.xpath( "//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		addobject("contactiframe",By.id( "contactInfoContentId"));
		addobject("about",By.id( "aboutTab"));
		addobject("lastname",By.id( "lastName"));
		addobject("saveall",By.xpath( "//input[@value='Save All']"));
		addobject("post",By.xpath( "//span[text()='Post']"));
		addobject("postiframe1",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addobject("posttextbox",By.xpath( "//body[@role='textbox']"));
		addobject("share",By.xpath( "//input[@name='publishersharebutton']"));
		addobject("file",By.xpath( "//span[text()='File']"));
		addobject("uploadfile",By.xpath( "//a[text()='Upload a file from your computer']"));
		addobject("choosefile",By.xpath( "//*[@id=\"chatterFile\"]"));
		addobject("sharefile",By.id("publishersharebutton"));
		addobject("photohover",By.id("photoSection"));
		addobject("addphoto",By.xpath( "//a[text()='Add Photo']"));
		addobject("browsephotoiframe",By.id("uploadPhotoContentId"));
		addobject("uploadInput",By.xpath( "//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		
		addobject("savephoto",By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]"));
		
		addobject("cropimage",By.xpath("//div[@class='imgCrop_wrap']"));
		addobject("finalsavephoto",By.xpath( "//input[@value='Save']"));
		
		
		addobject("menubutton",By.id("tsidButton"));
		
		addobject("salesmenu",By.xpath("//*[@id=\"tsid-menuItems\"]/a[1]"));
		addobject("SalesforceChatter",By.xpath( "//a[text()='Salesforce Chatter']"));
		addobject("marketing",By.xpath( "//a[text()='Marketing CRM Classic']"));	 
		addobject("devconsole",By.xpath( "//a[text()='Developer Console']"));
		addobject("logout",By.xpath( "//a[@href='/secur/logout.jsp']"));
		
		addobject("accounttab",By.xpath("//a[@title='Accounts Tab']"));
		addobject("OpportunitiesTab",By.xpath("//a[@title='Opportunities Tab']"));
		addobject("leadstab",By.xpath("//a[@title='Leads Tab']"));
		addobject("contactstab",By.id("Contact_Tab"));
		addobject("hometab",By.xpath(" //a[@title='Home Tab']"));
	}
}