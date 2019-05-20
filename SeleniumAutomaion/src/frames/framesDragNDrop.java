package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class framesDragNDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "d:\\Microsoftwebdriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));// switching using webelement
		Actions a=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(src, trg).perform();//dragging using web element 
		
		driver.switchTo().defaultContent(); //switching back to main page
		
		/*driver.switchTo().frame(0);// switching to frame using index number
		Actions a=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(src, trg).perform();*/
		
	

	}

}
