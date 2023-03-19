package testpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.SignUpPage;
import setupBrowser.Base;
import utils.UtilityClass;

public class CrossBrowserVerifySignUpPage extends Base {
	private WebDriver driver;
	private SignUpPage signUpPage;
	private LoginPage loginPage;
	private SoftAssert soft;
	private String testID;
	
	 @Parameters("broswer") 
	 @BeforeTest()
	 public void lanuchTheBrowser(String browserName)
	 {
		 System.out.println(browserName);
		 
		 if(browserName.equals("Chrome"))
		 {
			 driver= openChromeBroswer();
		 }
		 if(browserName.equals("Edge"))
		 {
			 driver= openEdgeBrowser();
		 }
		
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  System.out.println("before test");
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
//		 loginPage.clickOnCreateNewAccountButton();
	}
	
	@Test ()                       //dependsOnMethods="verifyLoginPage"
	public void verifySignUpPage() throws EncryptedDocumentException, IOException
	{
		testID="abcd";
		System.out.println("test 1");
		
	     loginPage.clickOnCreateNewAccountButton();
	     
	    
	     String data=UtilityClass.getDataFromExelSheet("Sheet4", 2, 2);
	     signUpPage.sendFname(data);
	     
	     data=UtilityClass.getDataFromExelSheet("Sheet4", 2, 3);
	     signUpPage.sendLname(data);
	     
	     data=UtilityClass.getDataFromExelSheet("Sheet4", 3, 0);
	     signUpPage.sendEmail(data);
	     
	     data=UtilityClass.getDataFromExelSheet("Sheet4", 3, 4);
	     signUpPage.sendPassword(data);
	     
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
	
	 @Test(priority=1)
	 public void verifyLoginPage() throws InterruptedException, EncryptedDocumentException, IOException
	 {       
		     testID="efgh";
		     
			  System.out.println("test 2");
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,3000)");
			    
			  Thread.sleep(2000);
			  JavascriptExecutor jss=(JavascriptExecutor)driver;
			  jss.executeScript("window.scrollBy(0,-3000)");
			    
//			  loginPage=new LoginPage(driver);
			  String data=UtilityClass.getDataFromExelSheet("Sheet4", 2, 0);
			  loginPage.sendEmail(data);
			  data=UtilityClass.getDataFromExelSheet("Sheet4", 2, 1);  
			  loginPage.sendPassword(data);
			  String url= driver.getCurrentUrl();
			  String title=driver.getTitle();
			  System.out.println(title);
			  Assert.assertEquals(url, "https://www.facebook.com/");
			  Assert.assertEquals(title, "Facebook � log in or sign up ");
			 
			  soft.assertEquals(url, "https://www.facebook.com/");
		      soft.assertEquals(title, "Facebook ? log in or sign up");
			  soft.assertAll();
	}
	@AfterMethod()
	public void aftermethod(ITestResult Result) throws IOException 
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			UtilityClass.cpatureScrenShot(testID, driver);
		}
		
		System.out.println("after method");
		System.out.println("logout");
		
	}
	
	@AfterClass
	public void clearPomObject()
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
//	configfailurepolicy="continue"
}
