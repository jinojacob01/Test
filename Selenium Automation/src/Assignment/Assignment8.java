package Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.cssSelector("#ui-id-1 li"));
		for (WebElement sugg : list) {
			if (sugg.getText().equals("United Kingdom (UK)")) {
				driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
				break;
			} else
				driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		}
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
