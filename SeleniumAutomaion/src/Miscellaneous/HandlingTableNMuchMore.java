//verify the whether total score is correct in crickbuzz score board

package Miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTableNMuchMore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20195/rsa-vs-sl-1st-test-sri-lanka-tour-of-south-africa-2019");
		
		WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//focusing the scope on the table by using webelement 'table'.
		int count=(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size());
		//System.out.println(count);
		int sum=0;
		for(int i=0;i<count-2;i++)// 'count-2' bcoz last 2 rows are extra and total, we want total of run scored by each player 
		{
			String runs=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int runsInt=Integer.parseInt(runs);//converting String variable 'runs' to integer.
			sum=sum+runsInt;
		}
		int extras=Integer.parseInt(table.findElement(By.xpath("//div[contains(text(),'Extra')]/following-sibling::div[1]")).getText());
		sum=sum+extras;
		System.out.println("Total Score :"+sum);
		int score=Integer.parseInt(table.findElement(By.xpath("//div[contains(text(),'Total')]/following-sibling::div[1]")).getText());
		System.out.println("Actual Score :"+score);
		
		if (sum==score)
		{
			System.out.println("total matches");
		}
		else
		{
			System.out.println("total doesn't match");
		}
		driver.quit();
	}

}
