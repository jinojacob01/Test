package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String textToSelect = "amazon india";
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Amaz");
		List<WebElement> optionsToSelect = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@jsname='bw4e9b']/li")));
		for (WebElement option : optionsToSelect) {
			if (option.getText().equals(textToSelect)) {
				System.out.println("Trying to select: " + textToSelect);
				option.click();
				break;
			}
		}
	}
}