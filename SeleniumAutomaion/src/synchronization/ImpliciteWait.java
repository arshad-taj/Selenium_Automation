package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliciteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.paytm.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Paytm Wallet')]")).click();
		WebDriverWait w=new WebDriverWait(driver,15);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("input_1")));
		w.until(ExpectedConditions.elementToBeClickable(By.id("input_1")));
		driver.findElement(By.id("input_1")).sendKeys("70000000");
		

}
}
