package com.appium.tests;

import org.testng.annotations.Test;

import com.utils.AppiumHelper;

public class TestClass extends BaseClass{
	
	private AppiumHelper helper = new AppiumHelper();
	String more ="//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]";
	String http ="//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]";
	String login="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAStaticText[1]";
	
	@Test
	
	public void tapOnSomething() {
			
		
		driver.findElementByXPath(more).click();
		//driver.findElementByXPath(login).click();
		driver.closeApp();
		
		
		
		
	}
	@Test 

	public void tapOnSomething1() {
		
		
		driver.launchApp();
		driver.findElementByXPath(http).click();;
		driver.closeApp();
		
	}
	

}
