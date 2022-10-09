package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void browserLaunch(String url) {
		driver.get(url);
	}

	public static WebElement locator(String attributeName, String attributeValue) {
		if (attributeName.equalsIgnoreCase("id")) {
			WebElement findElement = driver.findElement(By.id(attributeValue));
			return findElement;
		} else if (attributeName.equalsIgnoreCase("name")) {
			WebElement findElement = driver.findElement(By.name(attributeValue));
			return findElement;
		} else if (attributeName.equalsIgnoreCase("xpath")) {
			WebElement findElement = driver.findElement(By.name(attributeValue));
			return findElement;
		}

		else {
			System.out.println("None");
			return null;
		}

	}

/*	public static List<WebElement> tagName(String tagName)
{
	List<WebElement> findElements = driver.findElements(By.tagName(tagName));
	return findElements;
}*/
	public static void elementTextSend(WebElement findElement,String keysToSend)
	{
		findElement.sendKeys(keysToSend);
	}
	public static void elementTextClick(WebElement findELement)
	{
		findELement.click();
	}
	
	public static void select(WebElement element,String value)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
		
	}
	
}

