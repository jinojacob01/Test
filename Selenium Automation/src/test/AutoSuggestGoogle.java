package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestGoogle{

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	String textToSelect = "Amazon";
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jino.jacob\\\\Desktop\\\\eclipse-java-2022-09-R-win32-x86_64\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Amaz");

	List<WebElement> optionsToSelect = driver.findElements(By.xpath("(//div/ul[@class='G43f7e'])[1]"));
	System.out.println(optionsToSelect.size());
	for(WebElement option : optionsToSelect){
	    System.out.println(option.getText());
	    if(option.getText().equals(textToSelect)) {
	        System.out.println("Trying to select: "+textToSelect);
	        option.click();
	        break;
	    }
	}
}
}