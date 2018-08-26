package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractise {
	
	public WebDriver driver=null;
	
	
	@BeforeSuite
	public void SuiteSetup(){
		
		//System.setProperty("webdriver.chrome.driver", "E:\\software_api\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://www.qa.vitality.sumitomolife.co.jp/en/web/vitality-member-portal/login");
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		System.out.println("BeforeSuite: PageLoaded successfully");	
		
	}
	
	@BeforeClass	
	public void BeforeClass(){
		
		System.out.println("Beforeclass: Before the Suite Setup");
	}
	
	@AfterClass	
	public void AfterClass(){
		
		System.out.println("Afterclass: After the Tear Down");
	}
	
	@BeforeMethod
	public void BeforeMethod1(){
		System.out.println("BeforeMethod: Before all the Methods are run");
	}
	
	@AfterMethod
	public void After1Method(){
		System.out.println("AfterMethod: After all the Methods are run");
	}
	
	@BeforeTest
	public void BeforeEveryTest(){
		System.out.println("BeforeTest: Before every Test is run");
	}
	
	@AfterTest
	public void AfterEveryTest(){
		System.out.println("AfterTest: After every Test is run");
	}
	@Test
	public void test1(){
		System.out.println("Test1");
	}
	
	@Test
	public void test2(){
		System.out.println("Test2");
	}
	
	@AfterSuite
	public void TearDown(){
		driver.close();
		System.out.println("AfterSuite:Page closed successfully");
	}

}
