package elementsUI;

import org.openqa.selenium.By;

public class ProductsPageUI {

	public By logo_dashboard = By.xpath("//div[@class='app_logo']");
	public By item_backpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	public By item_flee_jacket = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");
	public By btn_cart_backpack = By.id("add-to-cart-sauce-labs-backpack");
	public By btn_cart_flee_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
	public By btn_cart = By.xpath("//a[@class='shopping_cart_link']");
	public By btn_burger_logo = By.id("react-burger-menu-btn");
	public By side_bar_btn_about = By.id("about_sidebar_link");
	public By btn_book_demo = By.xpath("//button[normalize-space()='Book a demo']");
	public By logo_sauceLabs_about = By.xpath("(//img[@alt='Saucelabs'])[1]");
	public By txt_item_1_price = By.xpath("//div[@class='inventory_list']//div[1]//div[2]//div[2]//div[1]");
	public By txt_item_2_price = By.xpath("//*[@id='inventory_container']/div/div[4]/div[2]/div[2]/div");
	public By txt_item_price_cart = By.xpath("//div[@class='inventory_item_price']");
	
}
