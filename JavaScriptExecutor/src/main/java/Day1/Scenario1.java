package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args)throws InterruptedException {
		//Click on element
		//up casting
		WebDriver driver = new ChromeDriver();
		
		//open URL
		driver.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(5000);
		
		//Find the female radio button
		WebElement wb = driver.findElement(By.id("gender-radio-2"));
		
		//Convert webdriver object to JavaScript Executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//use executeScript() method by passing aurguments[0].click() and webelement intance
		
		js.executeScript("argument[0].click();",wb);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
