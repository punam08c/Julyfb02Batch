package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class TestLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,3000)");
    
    Thread.sleep(2000);
    JavascriptExecutor jss=(JavascriptExecutor)driver;
    jss.executeScript("window.scrollBy(0,-3000)");
    
    LoginPage loginPage=new LoginPage(driver);
    
//    loginPage.sendEmail();
//    loginPage.sendPassword();
   
}
}
