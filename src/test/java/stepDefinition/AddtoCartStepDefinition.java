package stepDefinition;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.Assert;

import elementsUI.ProductsPageUI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.CommonLibrary;
import utils.TestContext;

public class AddtoCartStepDefinition {

	CommonLibrary commonLib;
	TestContext context;
	ProductsPageUI productUI = new ProductsPageUI();
	
	
	public AddtoCartStepDefinition(TestContext context) {
		this.context = context;
		commonLib = context.getCommonLib();
	}
	
	String price_item, price_in_cart;
	
	public HashMap<String,String> item_map() {
		HashMap <String, String> items_name = new HashMap<>();
		items_name.put("backpack", "Sauce Labs Backpack");
		items_name.put("jacket", "Sauce Labs Fleece Jacket");
		
		return items_name;
	}
	
	@When("User add {string} item to cart")
	public void add_item_one_to_cart(String item) {
		commonLib.verifyDynamicText(item);
		
		if(item.equalsIgnoreCase("Sauce Labs Backpack")){
			price_item = commonLib.getTextValue(productUI.txt_item_1_price);
			commonLib.click(productUI.btn_cart_backpack);
		}
		else if(item.equalsIgnoreCase("Sauce Labs Fleece Jacket")){
			price_item = commonLib.getTextValue(productUI.txt_item_2_price);
			commonLib.click(productUI.btn_cart_flee_jacket);
		}
		
	}
	
	@When("User could verify the item {string} is displayed in the cart page")
	public void verify_the_item_is_displayed_in_the_cart_page(String item) {
		
		commonLib.click(productUI.btn_cart);
		//Assert the item name appears correctly in the cart
		commonLib.verifyDynamicText(item);
		//also verify the price is correct
		price_in_cart = commonLib.getTextValue(productUI.txt_item_price_cart);
		
		Assert.assertEquals(price_item, price_in_cart);
	}
	
	
	
	@When("^User add (.+) item data to cart$")
	public void user_input_name_and_password(String item) {
		commonLib.verifyDynamicText(item);
		
		System.out.println("ContainsValue : "+item_map().containsValue(item));
		
		if(item.equalsIgnoreCase("Sauce Labs Backpack")){
			commonLib.click(productUI.btn_cart_backpack);
		}
		else if(item.equalsIgnoreCase("Sauce Labs Fleece Jacket")){
			commonLib.click(productUI.btn_cart_flee_jacket);
		}
	}
	
	@Then("^User could verify the item data (.+) is displayed in the cart page$")
	public void user_verify_the_item_is_displayed_in_the_cart_page(String item) {
		
		commonLib.click(productUI.btn_cart);
		commonLib.verifyDynamicText(item);

	}
}
