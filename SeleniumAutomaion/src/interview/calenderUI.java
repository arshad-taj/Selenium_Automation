package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderUI {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	
		WebElement month=driver.findElement(By.cssSelector("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
		System.out.println(month.getText());
		
		while (!(month.getText().contains("July")))
		{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		}
		
		driver.quit();

	}

}
