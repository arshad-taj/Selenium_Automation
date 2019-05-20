package windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		driver.get("https://www.google.com/");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).click(driver.findElement(By.className("gb_P"))).perform();
		
	
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parentWindow=itr.next();
//		String childWindow=itr.next();
//		driver.switchTo().window(childWindow);
//		System.out.println("I am in child window");
//		Thread.sleep(3000);
		driver.switchTo().window(itr.next());
		System.out.println("I am in child window");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		System.out.println("I am in parent window");
		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
