package seleniumTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 extends TestNGPractise{
	
	
	@BeforeTest
	
	public void loginApp(){
		
		System.out.println("Before Test TestNG 2");
	}
	
	@BeforeSuite
	
	public void loginApp8(){
		
		System.out.println("Before Suite TestNG 2");
	}
	
	
	@org.testng.annotations.BeforeClass	
	public void loginApp9(){
		
		System.out.println("Before class TestNG 2");
	}
	
	@org.testng.annotations.AfterClass
	public void loginApp10(){
		
		System.out.println("After class TestNG 2");
	}

	
	@BeforeMethod
	
	public void loginApp5(){
		
		System.out.println("Before Method TestNG 2");
	}
	
	@Test
	public void loginApp1(){
		
		System.out.println("Test TestNG 2");
	}
	
	@AfterMethod
	
	public void loginApp6(){
		
		System.out.println("After Method TestNG 2");
	}
	
	@AfterTest
	public void loginApp2(){
		
		System.out.println("After Test TestNG 2");
	}
	
	
	@AfterSuite
	
	public void loginApp7(){
		
		System.out.println("After Suite TestNG 2");
	}
}
