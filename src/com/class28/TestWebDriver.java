package com.class28;

public class TestWebDriver {
public static void main(String[] args) {
	
	ChromeDriver ch=new ChromeDriver();
	ch.closeBrowser();
	ch.findElement();
	ch.maximizeWindow();
	ch.openBrowser();
	ch.refreshBrowser();
	ch.getReport();
	ch.execute();
	ch.takesScreenshot();
	
	System.out.println();
	
	FirefoxDriver ff=new FirefoxDriver();
	ff.closeBrowser();
	ff.findElement();
	ff.maximizeWindow();
	ff.openBrowser();
	
	
	
	
	
	
	
	
	
	
	
}    
}
