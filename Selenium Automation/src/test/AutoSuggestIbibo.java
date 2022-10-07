package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestIbibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(
				By.xpath("//div[@class='sc-hiCibw dGZLZw']//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder']"))
				.click();
//		driver.findElement(By.xpath("//*[text()='From']//parent::div//child::p")).click();		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ko");
//		driver.findElement(By.xpath("//*[text()='From']//parent::div//child::input")).sendKeys("ko");
//		Thread.sleep(2000);
		List<WebElement> suggestions = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='autoSuggest-list']//child::li")));

//		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//child::li"));

		for (int i = 0; i < suggestions.size(); i++) {
			if (suggestions.get(i).getText().contains("Kota")) {
				suggestions.get(i).click();
				break;
			}
		}

//		for(WebElement sug : suggestions) {
//			if(sug.getText().contains("Kota")) {
//				sug.click();
//				break;
//			}
//		}
	}

}
