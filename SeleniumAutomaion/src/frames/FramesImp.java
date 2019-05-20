//verifying if object is present in the frame and performing operation using method(to identify frame in which element is present)


package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		int frameIndex=findFrameNumbers(driver, By.cssSelector("#tinymce"));
		System.out.println("fsdf "+frameIndex);
		//above: method findFrameNumber returning value of i i.e. frame number(index) in which element is present
		driver.switchTo().frame(frameIndex);
		driver.findElement(By.cssSelector("#tinymce")).clear();
		
	}
	
	public static int findFrameNumbers(WebDriver driver,By loactor )
	{
		int framecount=driver.findElements(By.tagName("iframe")).size();
		int i;
		for (i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			if(driver.findElements(loactor).size()>0)
			{
				break; //to jump out of the loop if condition is true to avoid unnecessary iteration
			}
			else
			{
				System.out.println("in else");
			}
		}
		driver.switchTo().defaultContent();// switching back to main page
		return i;
		
	}

}
