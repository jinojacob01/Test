package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String uname = driver.findElement(By.xpath("(//b/i)[1]")).getText();
		String psw = driver.findElement(By.xpath("(//b/i)[2]")).getText();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(psw);
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).getText());
		Select s = new Select(driver.findElement(By.cssSelector("select[data-style='btn-info']")));
		s.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/nav/a[@class='navbar-brand']")));
		System.out.println("logged in sucessfully");
		List<WebElement> buttons = driver.findElements(By.cssSelector("button.btn-info"));
		for (int i = 0; i < buttons.size(); i++) {
			driver.findElements(By.cssSelector("button.btn-info")).get(i).click();
			System.out.println(driver.findElements(By.cssSelector("app-card.col-lg-3 div h4")).get(i).getText()
					+ " is sucessfully added to cart");

		}
		driver.findElement(By.cssSelector("a.btn-primary")).click();
		driver.findElement(By.cssSelector("button.btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("Test");
		Thread.sleep(6000);
//		driver.findElement(By.id("country")).sendKeys(Keys.TAB);
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.suggestions")));
//		List<WebElement> suggestions = driver.findElements(By.cssSelector("div.suggestions"));
//		for (WebElement sug : suggestions) {
//			if(sug.getText().equalsIgnoreCase("india")) {
//				//driver.findElements(By.cssSelector("div.suggestions")).get(i).click();
//				sug.click();
//				break;
//			}
//		}
		
		
//		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.alert")).getText());
	}

}
