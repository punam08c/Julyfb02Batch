package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestClass {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
//		for(int i=0;i<5;i++)
//		{
////		 TakesScreenshot t=(TakesScreenshot)driver;
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Users\\chama\\OneDrive\\Desktop\\Excel\\Test-"+i+".jpeg");
//		FileHandler.copy(src, dest);
//	}
		 
		 //current date find system
		 SimpleDateFormat dateformate=new  SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		 Date date=new Date();
		 String d=dateformate.format(date);
		 System.out.println(dateformate.format(date));
		 System.out.println(date);
		 
//		random number generate
		   double c=Math.random();
		   System.out.println(c);
//		 try
//		 {
		    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\chama\\OneDrive\\Desktop\\Excel\\Test-"+d+"-"+c+".jpg");
			FileHandler.copy(src, dest);
//		 }
//		 catch(FileNotFoundException e)
//		 {
//			 System.out.println("hello");
//			 
//		 }
	
	}
}
