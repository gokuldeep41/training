package training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace 2\\training\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		WebElement input = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		Actions builder = new Actions(driver);
		
		Action enterWord = builder.keyDown(input, Keys.SHIFT)
				.sendKeys(input, "Gokul")
				.keyUp(Keys.SHIFT).build();
		
		enterWord.perform();
		
	}

}
