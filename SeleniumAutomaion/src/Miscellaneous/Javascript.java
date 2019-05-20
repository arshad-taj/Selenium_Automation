 

package Miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		// above statement unable to find the element as iti is hidden so we need to use javascript to do that.
		
//*****************************************Javascript Executor Ahead**************************************************************************//
	 JavascriptExecutor js=(JavascriptExecutor) driver; //type casting
	 
	 String jscript=" return document.getElementById(\"fromPlaceName\").value;";//don't forget to use 'return' as javascript use keyword return to print
	 String fromStation=js.executeScript(jscript).toString();// object value to string
	 
	// String fromStation=(String) js.executeScript(jscript); //Another way without using toString method
	 
	 System.out.println(fromStation);
	 driver.quit();
	 
	}
	

}
