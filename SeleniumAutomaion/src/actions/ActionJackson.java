package actions;

import org.apache.commons.io.testtools.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionJackson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximizing browser window
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Privacy Notice')]"));
		js.executeScript("arguments[0].scrollIntoView();",element);
//		Actions a=new Actions(driver);
//		WebElement element=driver.findElement(By.id("nav-link-accountList")); 
//		a.moveToElement(element).build().perform();
//		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
//		a.click(search).keyDown(Keys.SHIFT).sendKeys("uppercase ").keyUp(Keys.SHIFT).sendKeys("loweracse").perform();
//		
	}

}
