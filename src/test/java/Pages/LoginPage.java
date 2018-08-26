package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage extends Common.DriverUtil{
	
	//public WebDriver driver=null;
	
	@FindBy(id="email")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(linkText="パスワードをお忘れの場合")
	public WebElement ForgotPassword;
	
	@FindBy(id="login")
	public WebElement LoginButton;
	
	public LoginPage() throws IOException {
		super();
		//this.driver=driver;		
		PageFactory.initElements(driver, this);
				
	}
	
	public void Login(){
		String user=prop.getProperty("UserName");
		System.out.println(user);
		UserName.sendKeys(prop.getProperty("UserName"));
		password.sendKeys(prop.getProperty("Password"));
	/*	if(ForgotPassword.isDisplayed()){
			String TagForgot=ForgotPassword.getText();
			System.out.println("Forgot Password Tag:"+TagForgot);
		}	*/
		LoginButton.click();
	}
	

}
