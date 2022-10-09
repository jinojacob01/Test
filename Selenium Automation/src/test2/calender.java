package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1200)");
		
		Thread.sleep(1000L);
		driver.findElement(By.id("form-field-travel_from")).sendKeys("test");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));
		
		
//		Actions actions = new Actions(driver);
//		WebElement lang =   driver.findElement(By.id("form-field-travel_comp_language"));
//		Select language = new Select(lang);
//		actions.scrollToElement(submit).build().perform();
//		language.selectByVisibleText("Hindi");
		
//		WebElement element = driver.findElement(By.id("form-field-travel_comp_date"));
//		
//		actions.scrollToElement(element).click().build().perform();

		driver.findElement(By.id("form-field-travel_comp_date")).click();
//		driver.findElement(By.xpath("//div/input[@name='form_fields[travel_comp_date]']")).click();

	}

}
