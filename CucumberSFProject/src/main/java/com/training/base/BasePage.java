package com.training.base;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	BasePage page;
	WebDriver driver;
	HashMap<String,By> ObjectRepo = new HashMap<String,By>();
	
	
	
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}


	public void addobject(String elementName,By by) {
		
		ObjectRepo.put(elementName, by);
		
	}
	public WebElement getElement(String elementName) {
			By by = ObjectRepo.get(elementName);
			WebElement element = driver.findElement(by);
			return element;
	}


	public void enterintothetextbox(String elementName, String value) {
		WebElement element = getElement(elementName);
		element.clear();
		element.sendKeys(value);
	}


	public void clearsthepassword(String elementName) {
		WebElement element = getElement(elementName);
		element.clear();

		
	}


	public void clickonbutton(String elementName) {
		
		WebElement element = getElement(elementName);
		element.click();
		
	}


	public void waitforclickonButton(String elementName) {
		
		WebElement element = getElement(elementName);
		waitforElement(element);
		element.click();
	}


	public void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void switchtoiframe(String elementName) {
		
		WebElement element = getElement(elementName);
		waitforElement(element);
		driver.switchTo().frame(element);
		
	}


	public void waitandenterintothetextbox(String elementName,String value) {
		WebElement element = getElement(elementName);
		waitforElement(element);
		element.clear();
		element.sendKeys(value);
	}


	public void switchTodefaultpage() {
		driver.switchTo().defaultContent();
		
	}


	public void teardown() {
		driver.close();

		
	}


	public void waitandenterthefilelocation(String elementName,String value) {
		WebElement element = getElement(elementName);
		waitforElement(element);
		element.sendKeys(value);
		
	}


	public void mouseovertoelement(String elementName) {
		
		WebElement element = getElement(elementName);
		waitforElement(element);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}


	public void croptheimage(String elementName) {
		
		WebElement element = getElement(elementName);
		waitforElement(element);
		Actions action = new Actions(driver);
		action.clickAndHold(element).moveByOffset(44,55).release().build().perform();
		
	}


	public void selectdropdown(String elementName, String selecttext) {
		WebElement element = getElement(elementName);
		waitforElement(element);
		Select select = new Select(element);
		select.selectByVisibleText(selecttext);
	}


	public void waitforsometime() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void switchingtochildwindow() {
		String currentWindow =  driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		String newWindow="";
		for(String handle:allWindows) {
			if(!handle.equals(currentWindow)) {
				newWindow=handle;
				System.out.println(newWindow);
				driver.switchTo().window(newWindow);
			}
		}

		
	}


	public void switchtocurrentwindow() {
		
		
		
		

        // Switch back to the original window (assuming it was the first window opened)
        Set<String> windowHandles = driver.getWindowHandles();
        String originalWindowHandle = null;

        for (String handle : windowHandles) {
            if (!driver.switchTo().window(handle).getTitle().contains("New Window Title")) {
                originalWindowHandle = handle;
            }
        }

        driver.switchTo().window(originalWindowHandle);
	}


	
		
	}
	
	

