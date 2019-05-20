import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opts =new ChromeOptions();
		opts.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.justdial.com/travel/hotel-booking");
		
		System.out.println(driver.findElement(By.id("travel_search")).getText());
		driver.close();
	
}
}