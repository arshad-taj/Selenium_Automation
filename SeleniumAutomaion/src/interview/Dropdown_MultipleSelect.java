package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("http://facebook.com");
		
		Select day =new Select(driver.findElement(By.id("day")));
		List<WebElement> op=day.getOptions();
		
		for (int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i).getText());
		}

		System.out.println(day.isMultiple());// chech if ddlist is multiselect
		driver.close();

		
		
		
		
		
		
		
	}

}
