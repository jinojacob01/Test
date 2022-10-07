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
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[@class='sc-hiCibw dGZLZw']//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ko");
		Thread.sleep(2000);
//		List<WebElement> suggestions3 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("#autoSuggest-list")));
		List<WebElement> suggestions = driver.findElements(By.id("#autoSuggest-list"));
		List<WebElement> suggestions1 = driver.findElements(By.cssSelector("ul[id='autoSuggest-list']"));
		List<WebElement> suggestions2 = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']"));
		
		System.out.println(suggestions.size());
		System.out.println(suggestions1.size());
		System.out.println(suggestions2.size());
//		System.out.println(suggestions3.size());
//		System.out.println(suggestions.get(0).getText());
		
//		for(int i=0;i<suggestions.size();i++) {
//		System.out.println(driver.findElements(By.cssSelector("ul[id='autoSuggest-list']")).get(i).getText()); 
//		}
		
		
//		Thread.sleep(2000);
//		for(WebElement sug : suggestions) {
//			if(sug.getText().contains("Kota")) {
//				Thread.sleep(1000);
//				sug.click();
//				break;
//			}
//		}
	}

}
