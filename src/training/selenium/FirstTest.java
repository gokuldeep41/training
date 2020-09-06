package training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace 2\\training\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Browser Commands
		driver.get("https://facebook.com"); // used to launch/open
		
		System.out.println(driver.getTitle()); // give the title page
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close(); // closed
		
		Thread.sleep(3000);
		
		//Navigation Commands
		driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/"); // launching
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().back();

		
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.quit();
	}

}
