package training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitTest {

	public static void main(String ar[]) {
		System.setProperty("webdriver.chrome.driver", "/eclipse workspace 2/CucumberTesting/taj/resources/drivers/chromedriver.exe");
		long startTime = System.nanoTime();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//wait time
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		driver.findElement(By.xpath("//*[@id='downloadButton']")).click();
		
		WebElement closeButton = wait.until(
				ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
		
		closeButton.click();
		
		
		driver.quit();
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000000000);
	}
}
