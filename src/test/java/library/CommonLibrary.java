package library;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonLibrary {
	
	public WebDriver driver;

	// Constructor to parse the webdriver from test context
	public CommonLibrary(WebDriver driver) {
		this.driver = driver;
	}
	
	public void visit_page(String url) {
		driver.get(url);
	}
	
	public void type_into_field(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void elementIsDisplayed(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		driver.findElement(locator).isDisplayed();
	}
	
	public void verifyDynamicText(String text) {
		driver.findElement(By.xpath("//div[normalize-space()='"+text+"']"));
	}
	
	public void alertHandling() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	}

	public void scrollDown()throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
