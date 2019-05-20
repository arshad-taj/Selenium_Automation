package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1- Find the no. of links present in the web page
	
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println("Number of links :"+driver.findElements(By.tagName("a")).size());
		
//2- Find the no. of links present in footer
// Ans: For this we need to  reduce our scope to footer
		
		WebElement footerdriver=driver.findElement(By.id("navFooter"));
		
		System.out.println("No. of links in footer :"+footerdriver.findElements(By.tagName("a")).size());
		

	}

}
