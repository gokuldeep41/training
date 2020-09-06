package training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace 2\\training\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement element = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		element.click();
		Thread.sleep(2000);
		
		System.out.println(element.isEnabled());
		
		element.sendKeys("Training");
		Thread.sleep(2000);
		
		element.clear();
		Thread.sleep(1000);
		
		List<WebElement> names = driver.findElements(By.tagName("name"));
		
		if(names.size() == 3) {
			System.out.println("PASSED");
		}
		
		for(WebElement name: names) {
			System.out.println(name.getText());
		}
		
		driver.close();
		
	}

}
