package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	//Variable--WebElement declaration
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement pass;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement male;
	
	@FindBy(xpath="//select[@name='preferred_pronoun']")
	private WebElement pronoun;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signup;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement usernametext;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement usernametagname;
	
	@FindBy(xpath="//img[@class='_8idr img']")
	private WebElement crossbutton;
	
	//constructor--initilization
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//methods--Actions on WebElement
	public void sendFname(String name)
	{
		fname.sendKeys(name);
	}
	
	public void sendLname(String lnam)
	{
		lname.sendKeys(lnam);
	}
	
	public void sendEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void sendPassword(String Pass)
	{
		pass.sendKeys(Pass);
	}
	
	public void selectDropdownMonth()
	{
		 Select m=new Select(month);
		 m.selectByVisibleText("Aug");
	}
	
	public void selectDropdownDay()
	{
		 Select d=new Select(day);
	     d.selectByIndex(7);
	}
	
	public void selectDropdownYear()
	{
		Select y=new Select(year);
	     y.selectByIndex(12);
	}
	
	public void clickOnRadioButtonMale()
	{      
		male.click();
		boolean results=male.isSelected();
	     
	     System.out.println(results);
	     if(results==false)
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
	}
	
	public void checkPronunTextOption()
	{
		boolean result=pronoun.isDisplayed();
	     
	     System.out.println(result);
	     if(result==false)
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
	}
	public void verifySignupText()
	{
		String text=signup.getText();
	     System.out.println(text);
	     
	     if(text.equals("Sign Up"))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
	}

	public void verifyAttributeValueUserName()
	{
		String value=usernametext.getAttribute("aria-label");
	     System.out.println(value);
	     if(value.equals("Mobile number or email address"))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
	}
	
	public void verifyGetTagNameUser()
	{
		 String values= usernametagname.getTagName();
		  System.out.println(values);
		     
	}
	
	public void clickOntheSignupPageCrossArrow()
	{
		 crossbutton.click();
	}

	
	
	
}
