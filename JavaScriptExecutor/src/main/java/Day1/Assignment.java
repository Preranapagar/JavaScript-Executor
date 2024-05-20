package Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {

	public static void main(String[] args)throws InterruptedException,IOException {
		
		//Step 1: up casting
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		
		//Step 2: convert webdriver object to JavascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Step 3: open URL
		js.executeScript("window.location='https://demo.guru99.com/test/newtours/register.php';");
		
		//Step 4: maximize window
		driver.manage().window().maximize();
		
		//Step 5:Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Step 6:take screenshot
		TakesScreenshot ss = (TakesScreenshot)driver;
		File scr = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\Screenshot\\guru.png");
		FileUtils.copyFile(scr,dest);
		System.out.println("Screenshot Taken");
		
		Thread.sleep(3000);
		
		//Step 7:Find elements and enter values using JavascriptExecutor
		js.executeScript("document.getElementByID('userName').value='Pooja';");
		
		
		

	}

}
