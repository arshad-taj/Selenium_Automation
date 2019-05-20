package interview;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goodstuff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//***find the no.of links present in the footer and verify if they are opening 
		
		//finding no. of links....
		WebElement footercol=driver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		List<WebElement> list=footercol.findElements(By.tagName("a"));
		System.out.println("No. of links in first footer column :"+list.size());
		String ctrlEnt=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i=0;i<list.size();i++)
		{
			list.get(i).sendKeys(ctrlEnt);
			//Thread.sleep(5000);
		}
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> itr=tabs.iterator();
		
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
			
		}
		driver.quit();
		
	}

}
