package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,600)");
		System.out.println("No of columns: " + driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(
				"No of rows: " + driver.findElements(By.cssSelector(".table-display tr:nth-child(1) th")).size());
		int count = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td")).size();
		for (int i = 0; i < count; i++) {
			String data = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td")).get(i).getText();
			System.out.println(data);
		}

	}

}
