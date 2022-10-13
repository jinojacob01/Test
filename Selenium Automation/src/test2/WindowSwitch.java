package test2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String parentWindow = it.next();
		String childWildow = it.next();
		driver.switchTo().window(childWildow);
		driver.get("https://rahulshettyacademy.com/");
		String text = driver.findElement(By.xpath("//h2/a[contains(@href,'get-access-to-all-courses')]")).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("form div input[name='name']")).sendKeys(text);

	}

}
