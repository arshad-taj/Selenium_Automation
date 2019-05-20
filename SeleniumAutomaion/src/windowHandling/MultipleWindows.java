package windowHandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		Map<String,Object> prefs=new HashMap<String,Object>();
		
		prefs.put("profile.default_content_setting_values.notifications",2);
		
		ChromeOptions options=new ChromeOptions();
		
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.geckodriver.driver", "d:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.justdial.com/");
		
		WebElement b2b=driver.findElement(By.xpath("//*[@id=\"hotkeys_text_7\"]"));
		WebElement hotel=driver.findElement(By.xpath("//*[@id=\"hotkeys_text_11\"]"));
		
		Actions act=new Actions(driver);
		Actions act2=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(b2b).build().perform();//using click()
		act2.contextClick(hotel).sendKeys(Keys.ENTER).build().perform();//using sendKeys()
		
		//Thread.sleep(2000);
		
		String mainWindow=driver.getWindowHandle();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr=allWindows.iterator();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		for(String str:allWindows)
		{
			driver.switchTo().window(str);
			if (driver.getTitle().contains("Book Hotels"))
			{
				System.out.println("booooooook");
				Thread.sleep(50000);
				//wait.until(ExpectedConditions.elementToBeClickable(By.id("destinationName")));
				driver.findElement(By.id("destinationName")).sendKeys("Jam gayaaaaaaaaa");
			}
		
			
		}
//		Thread.sleep(3000);
//		driver.switchTo().window(mainWindow);
		
	}

}
