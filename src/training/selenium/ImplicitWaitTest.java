package training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {
	
	public static void main(String ar[]) {
		System.setProperty("webdriver.chrome.driver", "/eclipse workspace 2/CucumberTesting/taj/resources/drivers/chromedriver.exe");
		long startTime = System.nanoTime();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		//driver.get("http://www.google.com");
		try {
			
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='downloadButton']")).click();
			
			WebElement element = driver.findElement(By.xpath("//button[text()='Close']"));
			element.click();
		}
		catch(Exception e)
		{
			System.out.println("No element found");
		}
		finally {
			driver.quit();
			long endTime = System.nanoTime();
			long totalTime = endTime - startTime;
			System.out.println("Time taken: "+totalTime/1000000000);
		}
	}
}
