package test;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("li[class='ui-menu-item'] a"));
		System.out.println(options.size());

		System.out.println(options.get(2).getText());
//for(WebElement option :options)
//
//{
//
//if(option.getText().equalsIgnoreCase("India"))
//
//{
//
//option.click();
//
//break;
//
//}
//
//}

	}

}
