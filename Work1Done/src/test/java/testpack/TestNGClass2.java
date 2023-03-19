package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite TestNGClass2");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test TestNGClass2");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class TestNGClass2 ");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method TestNGClass2");
	}
	@Test
	public void test()
	{
		System.out.println("test 123 TestNGClass2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method TestNGClass2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestNGClass2");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test TestNGClass2");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite TestNGClass2");
	}
}
