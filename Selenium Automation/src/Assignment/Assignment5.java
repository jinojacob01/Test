package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();
		WebElement topFrame = driver.findElement(By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(topFrame);
		WebElement middleFrame = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(middleFrame);
//		driver.switchTo().frame("frame-top");
//		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		driver.switchTo().defaultContent();

	}

}
