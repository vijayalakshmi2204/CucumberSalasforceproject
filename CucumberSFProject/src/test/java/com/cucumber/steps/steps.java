package com.cucumber.steps;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.base.BasePage;
import com.training.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps extends BaseTest{
	BasePage page ;
	WebDriver driver;

	
 

 			@Given("User Launch the browser")
 			public void user_launch_the_browser() {
 				driver=launchapplication();
 			}
 			
 			@Given("User is on {string}")
 			public void user_is_on(String pageName) {
 			    
 				Class<?> ClassName;
 				Constructor<?> constructor;
 				
 				String packageName = "com.training.pages";
 				String fullpath = packageName + "."+pageName;
 				
 				try {
				page=(BasePage)	Class.forName(fullpath).getDeclaredConstructor(WebDriver.class).newInstance(driver);
 					} catch (Exception e) {
 						// TODO Auto-generated catch block
 						e.printStackTrace();
 					} 
 			
 			}
 			@Then("User enter into the textbox {string} {string}")
 			public void user_enter_into_the_textbox(String elementName, String value) {
     
 				page.enterintothetextbox(elementName,value);	
 			}
 			
 			@Then("User clears the password {string}")
 			public void user_clears_the_password(String elementName) {
 				page.clearsthepassword(elementName);
 			}

 			@Then("User click on the button {string}")
 			public void user_click_on_the_button(String elementName) {
 				page.clickonbutton(elementName);
     
 			}
 			

 			@Then("verify login with valid credentials")
 			public void verify_login_with_valid_credentials() {
 				String expectedtitle = "Home Page ~ Salesforce - Developer Edition";
 				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 				String actualtitle = driver.getTitle();
 				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 				assertEquals(actualtitle, expectedtitle);
 			}

 			

 			@Then("User checks the textbox  {string}")
 			public void user_checks_the_textbox(String elementName) {
 				
 				page.clickonbutton(elementName);
 			}
 			@Then("User wait and click on button {string}")
 			public void user_wait_and_click_on_button(String elementName) {
 			    page.waitforclickonButton(elementName);
 			}
 			@Then("click logout")
 			public void click_logout(String elementName) {
 				page.waitforclickonButton(elementName);
 			}
 			
 			
 			@Then("User closes the browser")
 			public void user_closes_the_browser() {
 			  
 				page.teardown();
	
 			}



 			@Then("User switchtoframe {string}")
 			public void user_switchtoframe(String elementName) {
 				page.switchtoiframe(elementName);
 			}
 			
 			
 			

 			@Then("User wait and enter into the textbox {string} {string}")
 			public void user_wait_and_enter_into_the_textbox(String elementName, String value) {
 				page.waitandenterintothetextbox(elementName,value);
 			}


 			

 			@Then("User switchTo defaultpage")
 			public void user_switch_to_defaultpage() {
 				page.switchTodefaultpage();
 			}



 			
 			
 			
 			@Then("User click on and sends the file location {string} {string}")
 			public void user_click_on_and_sends_the_file_location(String elementName, String value) {
 			    page.waitandenterthefilelocation(elementName,value);
 			}


 			
 			@Then("User does mouseover on {string}")
 			public void user_does_mouseover_on(String elementName) {
 				page.mouseovertoelement(elementName);

 			}


 			@Then("User waits and crop the image {string} {int} {int}")
// 			public void user_waits_and_crop_the_image(String elementName, Integer int1, Integer int2) {
// 			    page.croptheimage(elementName,int1,int2);
// 			}
		
 			

 			@Then("User waits and crop the image {string}")
 			public void user_waits_and_crop_the_image(String elementName) {
 			   

 				page.croptheimage(elementName);
 			}


 			

 			
 			

 			@Then("User selects the dropdown {string}  {string}")
 			public void user_selects_the_dropdown(String elementName, String selecttext) {
 				page.selectdropdown( elementName,  selecttext);
 				
 			}
 			
 			
 			

 			

 			@Then("User creates new account {string} {string} {string} {string}  {string} {string}  {string} {string}")
 			public void user_creates_new_account(String element1, String element2, String name, String drpele1, String text1, String dpele2, String text2, String element3) {
 			    
 					page.waitforclickonButton(element1);
 					page.enterintothetextbox(element2, name);
 					page.selectdropdown(drpele1, text1);
 					page.selectdropdown(dpele2, text2);
 					page.clickonbutton(element3);
 				


 			}
 			
 			
 			@Then("User switches to newwindow")
 			public void user_switches_to_newwindow() {
 			   page.switchingtochildwindow();
 			}
 			@Then("User switches to currentwindow")
 			public void user_switches_to_currentwindow() {
 			   page.switchtocurrentwindow();
 			}




 			@Then("User waits")
 			public void user_waits() {
 			    page.waitforsometime();
 			}









 			








}
