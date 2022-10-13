package testng;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jino.jacob\\Desktop\\eclipse-java-2022-09-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("to");
		List<WebElement> filteredList = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> comparisonList = filteredList.stream().filter(s->s.getText().contains("to")).collect(Collectors.toList());
//		filteredList.forEach(s->System.out.println(s.getText()));
		if(filteredList.equals(comparisonList))	{
			System.out.println("PASS");
		}else
			System.out.println("FAIL");

	}

}
