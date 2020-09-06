package training.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowTest {

	public static void main(String ar[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/eclipse workspace 2/CucumberTesting/taj/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		String handle = driver.getWindowHandle();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String h : handles) {
			if(!h.equals(handle)) {
				driver.switchTo().window(h);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(handle);
		driver.close();
	}
}
