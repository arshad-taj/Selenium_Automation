package Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotMethod {

	public static void main (String[] arg) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String date=sd.format(new Date());
		
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		screenShot(driver,date,"wow.png");
		
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\Selenium Screenshot\\sss.exe"));
		
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.chord("selenium",Keys.ENTER));
		screenShot(driver,date, "search.png");
		
		driver.findElement(By.partialLinkText("seleniumhq")).click();
		screenShot(driver, date,"seleniumhq.png");
		driver.quit();
	}
	
	public static void screenShot(WebDriver d,String date, String fileName) throws IOException {
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium Screenshot\\"+fileName+"_"+date));
	}

}
