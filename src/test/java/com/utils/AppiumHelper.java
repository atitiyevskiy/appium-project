package com.utils;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class AppiumHelper {
	 
	
	Logger log = LogManager.getLogger(AppiumHelper.class);
	
	private  String APPIUMSERVER = "/usr/local/bin/appium";     
	private  String NODECMD="/Applications/Appium.app/Contents/Resources/node/bin/node";
	private boolean newInstall;
	
	
	public void startAppiumServer() throws IOException, InterruptedException {  
	  
		log.info("Starting Appium server");
		
		
		
		// Ensure Appium instances are not running
		
		Runtime.getRuntime().exec("killall -9 node");
		Runtime.getRuntime().exec("killall -9 appium");
	
	    CommandLine command = new CommandLine(NODECMD);  
	    command.addArgument(APPIUMSERVER);
	    command.addArgument("--address", false);  
	    command.addArgument("localhost");  
	    command.addArgument("--port", false);  
	    command.addArgument("4723");  
	    command.addArgument("--full-reset", false); 
	    
	    DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();  
	    DefaultExecutor executor = new DefaultExecutor();  
	    executor.setExitValue(1);  
	    executor.execute(command, resultHandler);  
	  
	    Thread.sleep(5000);  
	        log.info("Appium server is now running");
	    	System.out.println("Appium server started");  
	}  
	  
	public  void stopAppiumServer() throws IOException {  
	    String[] command ={"/usr/bin/killall","-KILL","node"};  
	    Runtime.getRuntime().exec(command);  
	    System.out.println("Appium server stopped");  
	}  

/*	public void SetBeforeTest(boolean newInstall) {
		
		if (newInstall){
			
			log.info("Installing app for the initial test");
			
		//startAppiumDriver(newInstall);	
		}
	}
	
	protected void startAppiumDriver(boolean newInstall){
		this.newInstall=newInstall;
		
		
		
	}
	*/
	
}
