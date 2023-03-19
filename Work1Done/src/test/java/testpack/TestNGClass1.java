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

public class TestNGClass1 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite TestNGClass1");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test TestNGClass1");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class TestNGClass1 ");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method TestNGClass1 ");
	}
	@Test
	public void testA()
	{
		System.out.println("test A TestNGClass1 ");
	}
	@Test
	public void testB()
	{
		System.out.println("test B TestNGClass1 ");
	}
	@Test
	public void testC()
	{
		System.out.println("test C TestNGClass1 ");
	}
	@Test
	public void testD()
	{
		System.out.println("test D TestNGClass1 ");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method TestNGClass1 ");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestNGClass1 ");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test TestNGClass1");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("before suite TestNGClass1");
	}
}
