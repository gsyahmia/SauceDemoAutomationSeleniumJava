package utils;

import org.openqa.selenium.WebDriver;
import library.CommonLibrary;

public class TestContext extends DriverManager {
	
	private CommonLibrary commonLib;
	public TestContext() {
		setup();
	}

	public WebDriver getDriver() {
		return driver;
		
	}
	
	public CommonLibrary getCommonLib() {
		if(commonLib==null) {
			commonLib = new CommonLibrary(driver);
		}
		
		return commonLib;
		
	}
	
}
