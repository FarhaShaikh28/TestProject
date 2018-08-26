package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverUtil {
	
	public static WebDriver driver=null;
	
	public static Properties prop=null;
	
	//@Parameters("BrowserName")
	//@Test
	public DriverUtil(/*String BrowserName*/) throws IOException{
		
		String BrowserName=ReadProperty("Browser");
		
		if(BrowserName.equals("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "E:\\software_api\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get(ReadProperty("URL"));			
			
		}else if(BrowserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\software_api\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			driver.get(ReadProperty("URL"));
			
		}		
		
	}
	
	
	public String ReadProperty(String PropertySearchKey) throws IOException{
		
		File file=new File("E:\\workspace\\TestProject\\src\\test\\resources\\Project.properties");
		
		FileInputStream fip=new FileInputStream(file);
		
		prop=new Properties();
		prop.load(fip);
		
		String PropertyValue=prop.getProperty(PropertySearchKey);
		
		return PropertyValue;
		
	}
	
	
	

}
