package interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("No. of links---> "+links.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		for(int i=0;i<links.size();i++)
		{
			if (links.get(i).getAttribute("href")!=null)
			{
				activeLinks.add(links.get(i));
			}
		}
		System.out.println("No. of active links---> "+activeLinks.size());
		
		
		for (int j=0;j<activeLinks.size();j++)
		{
		HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		connection.disconnect();
		if(!response.equalsIgnoreCase("ok"))
		System.out.println(activeLinks.get(j).getAttribute("href")+"---->"+response);
		
		
		}	
		

	}

}
