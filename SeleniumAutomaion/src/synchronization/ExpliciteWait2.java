package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ExpliciteWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.paytm.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Paytm Wallet')]")).click();
		driver.findElement(By.id("input_1")).click();
		
	
	}

}
