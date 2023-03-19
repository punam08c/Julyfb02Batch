package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityClass;

public class LoginPage {
	//Variable--WebElement declaration
	private WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Create new account')]")
	private WebElement createNewAccount;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='u_0_5_SN']")
	private WebElement loginButton;
	
	//constructor--initilization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//methods--Actions on WebElement
	public void clickOnCreateNewAccountButton()
	{
		createNewAccount.click();
	}
	
	public void sendEmail(String emailID) 
	{
//		email.sendKeys("xyz@gmail.com");
		email.sendKeys(emailID);
//		System.out.println(emailID);
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	
	
	//Group of Actions
	
//	public void loginToApplication()
//	{
//		createNewAccount.click();
//		email.sendKeys("xyz@gmail.com");
//		password.sendKeys("9927363728");
//		loginButton.click();
//	}
	
	
}
