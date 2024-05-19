package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		//Enter value in text box
		//arguments[0].value
		
		//Step 1: up casting
		WebDriver driver = new ChromeDriver();
		
		//Step 2: open URL
		driver.get("https://www.facebook.com");
		
		//Step 3:find the element
		WebElement wb = driver.findElement(By.id("email"));
		
		//Step 4: convert webdriver object to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Step 5: use executeScript() method to pass value
		js.executeScript("arguments[0].value='aneha@gmail.com';",wb);
	}

}
