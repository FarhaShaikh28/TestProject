import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.DriverUtil;
import Pages.LoginPage;

public class LoginTestScript extends Common.DriverUtil{
	
	LoginPage login;
	
	public LoginTestScript() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void SetUp() throws IOException{		
		System.out.println("Browser Successfull opened");
		login=new LoginPage();
		login.Login();
	}
	
	@Test
	public void LoginPageTest(){
		login.Login();		
		System.out.println("Login Successfull");
	}
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}

}
