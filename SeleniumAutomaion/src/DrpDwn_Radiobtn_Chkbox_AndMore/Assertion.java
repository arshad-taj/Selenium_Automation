package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement chkbox=driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm"));
		
		Assert.assertFalse(chkbox.isSelected()); 
		chkbox.click();
		
		Assert.assertTrue(chkbox.isSelected());
        
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i=1;i<=4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");// validating expected no. of passengers with actual
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000L);
		driver.close();
	
	}

}
