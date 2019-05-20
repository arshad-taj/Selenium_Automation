package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "d:\\microsoftwebdriver.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//*[@value='Confirmation Alert']")).click();
		
		//driver.switchTo().alert().sendKeys("fesfe");
		System.out.println(driver.switchTo().alert().getText());//getting text present on pop up alert
		
		driver.switchTo().alert().accept();//submitting ok
		//driver.switchTo().alert().dismiss();
		
		driver.close();
	

	}

}
