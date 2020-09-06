package training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace 2\\training\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		
		WebElement ele = driver.findElement(By.id("animals"));
		
		Select dropdown = new Select(ele);
		
		dropdown.selectByIndex(3);
		Thread.sleep(1000);
		
		dropdown.selectByValue("babycat");
		Thread.sleep(1000);
		
		dropdown.selectByVisibleText("Avatar");
		Thread.sleep(1000);
		
		driver.quit();

	}

}
