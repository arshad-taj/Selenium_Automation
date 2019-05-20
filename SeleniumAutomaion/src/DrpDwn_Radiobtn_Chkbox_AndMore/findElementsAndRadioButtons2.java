/*Selecting radio button 'Butter' without using path. And using getAttribute mathod to
  identify 'value' of button*/
 
package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsAndRadioButtons2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	
	int count=driver.findElements(By.name("group1")).size();
	 for (int i=0;i<=count;i++) {
		 String value=driver.findElements(By.name("group1")).get(i).getAttribute("value");
		 if (value.equals("Cheese")) // "==" fails to compare string, for string should use .equals function.
		 {
			 driver.findElements(By.name("group1")).get(i).click(); 
		 }
	 }
	
	
	


	}

}
