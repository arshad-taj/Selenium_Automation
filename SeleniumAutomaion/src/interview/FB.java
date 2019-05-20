package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FB {
 WebDriver driver;
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void fbLogin() {
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("arshad.tajuddin@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
		WebElement loginBtn=driver.findElement(By.xpath("//label[@id='loginbutton']/input"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",loginBtn);
		
		
	}
	
}
