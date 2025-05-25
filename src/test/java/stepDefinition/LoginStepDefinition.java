package stepDefinition;

import elementsUI.LoginPageUI;
import elementsUI.ProductsPageUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.CommonLibrary;
import utils.ConfigProperties;
import utils.TestContext;

public class LoginStepDefinition {
	
	CommonLibrary commonLib;
	TestContext context;
	LoginPageUI loginUI = new LoginPageUI();
	ProductsPageUI productUI = new ProductsPageUI();
	
	
	public LoginStepDefinition(TestContext context) {
		this.context = context;
		commonLib = context.getCommonLib();
	}
	
	@Given("User navigate to saucelab login page")
	public void navigate_to_saucelab_login_page() throws InterruptedException {
		ConfigProperties.initializePropertyFile();
		String url = ConfigProperties.property.getProperty("SauceLabURL");
		commonLib.visit_page(url);
	}
	
	@When("User successfully login with correct username {string} and password {string}")
	public void login_with_correct_username_and_password(String usrnm, String pwd) {
		commonLib.type_into_field(loginUI.txt_username, usrnm);
		commonLib.type_into_field(loginUI.txt_password, pwd);
		commonLib.click(loginUI.btn_login);
	}
	
	@Then("User landing in the main page")
	public void landing_in_the_main_page() {
		commonLib.elementIsDisplayed(productUI.dashboard_logo);
	}
	
}
