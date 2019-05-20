package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstCry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver, 30);
			
		driver.get("http:\\firstcry.com");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='img-block']/a"));
		String resultStr="";
		int resultInt=0;
		
		for(int i=0;i<6;i++)
		{
			//wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(list.get(i))));
			try {
			list.get(i).click();
			}
			catch (StaleElementReferenceException e)
			{
				list=driver.findElements(By.xpath("//div[@class='img-block']/a"));
				list.get(i).click();
			}
			
			resultStr=driver.findElement(By.xpath("//li[@class='topr']")).getText().replaceAll("[^0-9]", "");
			resultInt=Integer.parseInt(resultStr);
			if(resultInt<=0)
			{
				System.out.println("No result");
			}
			else
			{
				System.out.println(resultStr);
			}
			
			driver.navigate().back();
		}
		
		
		
		

	}

}
