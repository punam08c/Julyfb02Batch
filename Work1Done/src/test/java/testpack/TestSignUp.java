package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.SignUpPage;

public class TestSignUp {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\chama\\OneDrive\\Desktop\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver =new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com/");
     
     LoginPage loginPage=new LoginPage(driver);
     loginPage.clickOnCreateNewAccountButton();
     
    
     SignUpPage signUpPage=new SignUpPage(driver);
//     signUpPage.sendFname();
//     signUpPage.sendLname();
//     signUpPage.sendEmail();
//     signUpPage.sendPassword();
     signUpPage.selectDropdownMonth();
     signUpPage.selectDropdownYear();
     signUpPage.selectDropdownDay();
     signUpPage.clickOnRadioButtonMale();
     signUpPage.checkPronunTextOption();
     signUpPage.verifyAttributeValueUserName();
     signUpPage.verifyGetTagNameUser();
     signUpPage.clickOntheSignupPageCrossArrow();
     
     String urls=driver.getCurrentUrl();
     System.out.println(urls);
     
     
     
     
}
}
