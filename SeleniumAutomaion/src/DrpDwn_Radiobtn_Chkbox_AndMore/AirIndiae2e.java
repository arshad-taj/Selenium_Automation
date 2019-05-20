package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AirIndiae2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.airindia.in/");
		driver.findElement(By.cssSelector(".bookFlight>a")).click();//xpath: "//li[@class='bookFlight']/a"
		
		WebElement oneway=driver.findElement(By.cssSelector("#oneway+ins")); //xpath "//*[@id='oneway']/following-sibling::ins"
		Assert.assertFalse(oneway.isSelected());
		oneway.click();
		
		WebElement source= driver.findElement(By.id("from"));
		source.click();
		source.sendKeys("Nagp");
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination= driver.findElement(By.id("to"));
		destination.click();
		destination.sendKeys("Mum");
		Thread.sleep(1000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("_depdateeu1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[class*='highlight']")).click();
		Thread.sleep(500);
		
		Assert.assertFalse(driver.findElement(By.id("_retdateeu1")).isEnabled());
		
		Assert.assertTrue(driver.findElement(By.id("flexibleDate")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.id("rdrules1")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.cssSelector("#concessionaryType1")).isEnabled());
		
		Select adults=new Select(driver.findElement(By.cssSelector("#ddladult1")));  
		adults.selectByValue("3");
		
		Select list=new Select(driver.findElement(By.cssSelector("#_classType1")));
		list.selectByVisibleText("Business");
		
		driver.findElement(By.id("btnbooking")).click();
		
		
		
				
				

	}

}
