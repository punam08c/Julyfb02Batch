package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.SignUpPage;


public class SimpleTestngClass {

	public class VerifySignUpPage  {
		private WebDriver driver;
		private SignUpPage signUpPage;
		private LoginPage loginPage;
		 private SoftAssert soft;
		
		
		 
		 @BeforeTest
		 public void lanuchTheBrowser()
		 {
			 System.out.println("before test");
			 
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver =new ChromeDriver();
			
			 
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.manage().window().maximize();
//			  driver.get("https://www.facebook.com/");
		 }
		@BeforeClass
		public void createPomObject()
		{
			System.out.println("before class");
			loginPage=new LoginPage(driver);
			signUpPage=new SignUpPage(driver);
			
		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("before method");
			driver.get("https://www.facebook.com/");
			 soft=new SoftAssert();
		}
		@Test()                                       //dependsOnMethods="verifyLoginPage"
		public void verifySignUpPage()
		{
			System.out.println("test 1");
			
		     loginPage.clickOnCreateNewAccountButton();
		     
		    
		     
//		     signUpPage.sendFname();
//		     signUpPage.sendLname();
//		     signUpPage.sendEmail();
//		     signUpPage.sendPassword();
		     signUpPage.selectDropdownMonth();
		     signUpPage.selectDropdownYear();
		     signUpPage.selectDropdownDay();
		     signUpPage.clickOnRadioButtonMale();
		     signUpPage.checkPronunTextOption();
		     signUpPage.verifyAttributeValueUserName();
		     signUpPage.verifyGetTagNameUser();
		     signUpPage.clickOntheSignupPageCrossArrow();
		     signUpPage.verifySignupText();

		     String urls=driver.getCurrentUrl();
		     System.out.println(urls);
		     
		   }
		@Test()
		public void verifyLoginPage() throws InterruptedException
		{       
				  System.out.println("test 2");
				   JavascriptExecutor js=(JavascriptExecutor)driver;
				    js.executeScript("window.scrollBy(0,3000)");
				    
				    Thread.sleep(2000);
				    JavascriptExecutor jss=(JavascriptExecutor)driver;
				    jss.executeScript("window.scrollBy(0,-3000)");
				    
//				   loginPage=new LoginPage(driver);
				    
//				   loginPage.sendEmail();
//				   loginPage.sendPassword();
				    
				  String url= driver.getCurrentUrl();
				  String title=driver.getTitle();
				  System.out.println(title);
				  Assert.assertEquals(url, "https://www.facebook.com/");
		//		  Assert.assertEquals(title, "Facebook � log in or sign up");
				 
				  soft.assertEquals(url, "https://www.facebook.com/");
////			  soft.assertEquals(title, "Facebook ? log in or sign up");
				  soft.assertAll();
		}
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("after method");
			System.out.println("logout");
			
		}
		
		@AfterClass
		public void clearObject()
		{
			loginPage=null;
			signUpPage=null;
		}
		
		@AfterTest
		public void closeBrowser()
		{
			System.out.println("after class");
			driver.close();
			driver=null;
			System.gc();  //garbege collector
		}
}

}