package setupBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	
	//broswer Related code
	public static WebDriver openChromeBroswer()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
	     return driver;
	}
	
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\edgedriver_win32 (1)\\msedgedriver.exe");
	    WebDriver driver =new EdgeDriver();
	     return driver;
	}
	
	
//	public static WebDriver openOperaBroswer()
//	{
//		System.setProperty("webdriver.opera.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//	    OperaDriver driver =new OperaDriver();
//	     return driver;
//	}
}
