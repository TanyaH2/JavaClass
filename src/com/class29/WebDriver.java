package com.class29;

/*
 * Create a WebDriver Interface that will have the following unimplemented behaviour: 
 * openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
 * Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver extends TakesScreenshot {

	void openBrowser();
	void closeBrowser();
	public void maximizeWindow();
	public abstract void findElement();
	void execute();
	
}


       //concrete class
class ChromeDriver extends Browser implements WebDriver, Report, Executes{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can open pages in Chrome Browser");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can close Chrome Browser by clicking x");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver Maximize Windows in Chrome browser");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("ChromeDriver can find needed elements on the page");
	}

	@Override
	public void refreshBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Chrome can refresh browser");
	}

	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		System.out.println("Report from Chrome Browser");
	}

	@Override
	public void takesScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("Can take a screenshot in Chrome browser");
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("can excute in Chrome browser");
	}

	@Override
	public void takesScreenShot() {
		// TODO Auto-generated method stub
		
	}
	
}

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Firefox Driver can open pages ");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Firefox Driver can close Browser by clicking x");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("Firefox Driver Maximize Windows");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("Firefox Driver can find needed elements on the page");
	}

	@Override
	public void takesScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takesScreenShot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}







