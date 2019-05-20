//TC: identify if the source field has 'international' in suggestive drop down list 

package Miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		//Thread.sleep(2000);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=js.executeScript(script).toString();
		int i=0;
		while (!text.toLowerCase().contains("internation"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=js.executeScript(script).toString();
			System.out.println(text);
			//if string does't match while loop will execute infinite times to avoid that
			//we will use if statement
			if (i>10)
			{
				break;
			}
		}
		if (i>10)
		{
			System.out.println("Elemenet not found");
		}
		else
		{
			System.out.println("Elemenet found");
		}
	
		
	 driver.quit();
	 
	}
	

}
