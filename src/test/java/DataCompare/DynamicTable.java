package DataCompare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "E:\\software_api\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='customers']"))));
		
		List<WebElement> list1=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowCount=list1.size();
		
		List<WebElement> list2=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
		int ColumnCount=list2.size();
		
		List<String> str=new ArrayList<>();	
		String str1,str2;
		
		for(int i=1;i<=rowCount;i++){
			for(int j=1;j<=ColumnCount;j++){
				
				if(i==1){
				
					str1=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/th["+j+"]")).getText();
					
					str=Arrays.asList(str1);
				
				//System.out.println(str);	
				}else{
					str2=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
					
					str=Arrays.asList(str2);
				
				}	
				System.out.println(str);
			}
		}
	
		FileInputStream ExcelFile =new FileInputStream("C:\\Users\\dell\\Desktop\\Excel.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(ExcelFile);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		int RowCountExcel=sheet.getLastRowNum();
		
		int ColumnCountExcel=sheet.getRow(0).getLastCellNum();
		
		List<String> list3= new ArrayList();
		String StrExcel;
		
		for(int i=0;i<RowCountExcel;i++){
			for(int j=0;j<ColumnCountExcel;j++){
				
				StrExcel=sheet.getRow(i).getCell(j).getStringCellValue();
				
				list3=Arrays.asList(StrExcel);
				System.out.print(list3);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
				
		//System.out.println("Excel data:"+list3);
		if(list3.equals(str)){
			System.out.println("List are equal");
		}else{
			System.out.println("List are unequal");
		}
		
	}

}

