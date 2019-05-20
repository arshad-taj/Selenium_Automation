package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Select list=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		list.selectByValue("USD");
		//list.deselectByIndex(2); can not use deselect as dropdown is not multiple select
		list.selectByVisibleText("INR");
		list.selectByIndex(1);
		driver.close();
		

	
	}

}
