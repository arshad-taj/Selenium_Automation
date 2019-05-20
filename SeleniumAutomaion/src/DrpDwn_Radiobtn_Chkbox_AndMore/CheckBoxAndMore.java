package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxAndMore {
	

	public static void main(String[] args) throws InterruptedException {
		CheckBoxAndMore obj=new CheckBoxAndMore();
		System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		WebElement chkbox=driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm"));
		boolean b=chkbox.isSelected();
		
		//obj.isSelected(b);
		System.out.println(obj.isSelected(b));
		chkbox.click();
		b=chkbox.isSelected();
		
		//obj.isSelected(b);
		System.out.println(obj.isSelected(b));
		
		Thread.sleep(4000);
		driver.close();
		
		
			
		}
	public boolean isSelected(boolean bb) {
		if (bb==true) {
			//System.out.println("Chkbox is selected");
			return false;
			}
		else {
			//System.out.println("Chkbox is not selected");
			return true;
		}
		
		
	}
	}


