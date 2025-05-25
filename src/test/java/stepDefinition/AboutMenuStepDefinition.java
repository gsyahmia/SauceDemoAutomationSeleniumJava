package stepDefinition;

import elementsUI.ProductsPageUI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.CommonLibrary;
import utils.TestContext;

public class AboutMenuStepDefinition {

	CommonLibrary commonLib;
	TestContext context;
	ProductsPageUI productUI = new ProductsPageUI();
	
	public AboutMenuStepDefinition(TestContext context) {
		this.context = context;
		commonLib = context.getCommonLib();
	}
	
	@When("User navigate to about menu side bar")
	public void navigate_to_about_menu_side_bar() {
		commonLib.click(productUI.btn_burger_logo);
		commonLib.click(productUI.side_bar_btn_about);
	}
	
	@Then("User verify the about page is displayed")
	public void verify_the_about_page_is_displayed() {
		commonLib.elementIsDisplayed(productUI.logo_sauceLabs_about);
		commonLib.elementIsDisplayed(productUI.btn_book_demo);
	}
}
