package com.appium.tests;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.utils.AppiumHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class BaseClass   {
	
	public AppiumDriver driver;
	private AppiumHelper helper = new AppiumHelper();
	
	@BeforeTest
	
	public void setUp() throws IOException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		helper.startAppiumServer();
		capabilities.setCapability("appium-version", "1.5");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "9.2");
		capabilities.setCapability("deviceName", "iPhone 6s");
		capabilities.setCapability("app", "/Users/home/Desktop/test_app.ipa");
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		}

	
/*
	@AfterMethod
	
	public void closeApp(){
		driver.closeApp();
		
	}
	
	@AfterTest
	
	public void tearDown() throws IOException{
		
		helper.stopAppiumServer();
	*/	
		
	}
	





