import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Udemy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.desidime.com/selective_search?utf8=%E2%9C%93&keyword=udemy&search_list=coupons&button=");
		
		//List <WebElement> courses= driver.findElements(By.cssSelector("[class='click_coupons_code']"));
		
		Actions act=new Actions(driver)	;	
			
		while (driver.findElements(By.xpath("//a[text()='Last »']")).size()>0)
		{
			
			clickCourse(act,driver);
			driver.findElement(By.xpath("//a[text()='Next ›']")).click();
			
		}
	
	}
	
	public static void clickCourse(Actions aa, WebDriver driver )
	{
		try {
			for (int i=0;i<driver.findElements(By.cssSelector("[class='click_coupons_code']")).size();i++)
			{
				
				if(driver.findElements(By.cssSelector("[class='click_coupons_code']")).get(i).getText().toLowerCase().contains("selenium"))
				{
					WebDriverWait w=new WebDriverWait(driver, 20);
					w.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.cssSelector("[class='click_coupons_code']")).get(i)));
					aa.moveToElement(driver.findElements(By.cssSelector("[class='click_coupons_code']")).get(i)).contextClick().sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
					
				}
			}
		}
		catch (StaleElementReferenceException e) {
			for (int i=0;i<driver.findElements(By.cssSelector("[class='click_coupons_code']")).size();i++)
			{
				
				if(driver.findElements(By.cssSelector("[class='click_coupons_code']")).get(i).getText().toLowerCase().contains("selenium"))
				{
					WebDriverWait w=new WebDriverWait(driver, 20);
					w.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.cssSelector("[class='click_coupons_code']")).get(i)));
					aa.moveToElement(driver.findElements(By.cssSelector("[class='click_coupons_code']")).get(i)).contextClick().sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
					
				}
			}
		}
		}
		
			
	}


