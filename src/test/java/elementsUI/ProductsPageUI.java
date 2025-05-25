package elementsUI;

import org.openqa.selenium.By;

public class ProductsPageUI {

	public By dashboard_logo = By.xpath("//div[@class='app_logo']");
	public By item_backpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	public By item_flee_jacket = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");
	public By btn_cart_backpack = By.id("add-to-cart-sauce-labs-backpack");
	public By btn_cart_flee_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
	public By btn_cart = By.xpath("//a[@class='shopping_cart_link']");
}
