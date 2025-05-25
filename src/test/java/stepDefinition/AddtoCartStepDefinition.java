package stepDefinition;

import java.util.HashMap;
import java.util.Map.Entry;

import elementsUI.ProductsPageUI;
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
	
	
	
	public HashMap<String,String> item_map() {
		HashMap <String, String> items_name = new HashMap<>();
		items_name.put("backpack", "Sauce Labs Backpack");
		items_name.put("jacket", "Sauce Labs Fleece Jacket");
		
		return items_name;
	}
	
	@When("User add {string} item to cart")
	public void add_item_one_to_cart(String item) {
		commonLib.verifyDynamicText(item);
		
		System.out.println("ContainsValue : "+item_map().containsValue(item));
		
		if(item.equalsIgnoreCase("Sauce Labs Backpack")){
			commonLib.click(productUI.btn_cart_backpack);
		}
		else if(item.equalsIgnoreCase("Sauce Labs Fleece Jacket")){
			commonLib.click(productUI.btn_cart_flee_jacket);
		}
		
	}
	
	@When("User could verify the item {string} is displayed in the cart page")
	public void verify_the_item_is_displayed_in_the_cart_page(String item) {
		
		commonLib.click(productUI.btn_cart);
		commonLib.verifyDynamicText(item);
		//also verify the price is correct
	}
}
