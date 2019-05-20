package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsAndRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.findElement(By.cssSelector("[type='radio'][value='1']"));
	Thread.sleep(520);
	
	System.out.println(driver.findElements(By.cssSelector("[type='radio']")).size());
	//To get no.of radio button using 'findElements'and size method
	


	}

}
