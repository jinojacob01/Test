package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestMakemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.cssSelector("input[class*='react-autosuggest__input']")).sendKeys("ko");
		List<WebElement> suggestions = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")));
		for (WebElement sug : suggestions) {
			if (sug.getText().contains("Pune")) {
				sug.click();
				break;
			}
		}

	}

}
