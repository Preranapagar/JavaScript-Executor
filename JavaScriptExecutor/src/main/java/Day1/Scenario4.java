package Day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) throws InterruptedException{
		//enter value in text box
		//document.getElementById() method
		
		//up casting
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(3000);
		
		//convert the webdriver object in JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//use executescript method
		js.executeScript("document.getElementById('firstname').value='pooja';");
		

	}

}
