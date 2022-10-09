package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String clickedOption = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		Select opt = new Select(driver.findElement(By.id("dropdown-class-example")));
		opt.selectByVisibleText(clickedOption);
		driver.findElement(By.id("name")).sendKeys(clickedOption);
		driver.findElement(By.id("alertbtn")).click();
		String textToVerify = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if (textToVerify.contains(clickedOption)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

}
