package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
//		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.cssSelector("#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
//		System.out.println(driver.findElement(By.cssSelector("#draggable")).getText());
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();

		// 1fe44352-ab5e-48ae-a39f-7f77f858710b

	}

}
