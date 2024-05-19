package Day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario6 {

	public static void main(String[] args) {
		// open URL using JavascriptExecutor
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.facebook.com';");

	}

}
