package elementsUI;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	
	public LoginPageUI() {	
	}
	// Locators
	public By txt_username = By.xpath("//input[@id='user-name']");
	public By txt_password = By.xpath("//input[@id='password']");
	public By btn_login = By.id("login-button");
	
	
}
