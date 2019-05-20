package DrpDwn_Radiobtn_Chkbox_AndMore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "d:\\Microsoftwebdriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement source=driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));/*using variable source of
		data type 'WebElement' to store the element as we need this element multiple times*/
		
		source.clear(); //clearing the text field using clear() method.
		source.sendKeys("Ako");
		Thread.sleep(1000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.cssSelector("span.o-i-swap-button+div>input"));
		//above in css selector '+' used to traverse to Sibling and '>' to child.
		destination.sendKeys("Nag");
		Thread.sleep(1000);
		for (int i=1;i<=5;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(420);
		}
		destination.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
