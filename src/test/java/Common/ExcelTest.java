package Common;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	
	public static void main(String args[]) throws IOException{		
	
		File file =new File("C:\\Users\\dell\\Desktop\\abc.xlsx");
		
		FileInputStream fip=new FileInputStream(file);
	
		XSSFWorkbook wb= new XSSFWorkbook(fip);
		
		XSSFSheet sheet= wb.getSheet("abc");
		
		int rowCount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		
		//String str=null;
		
		for(int i=1;i<rowCount;i++){
			
				for(int j=1;j<columncount;j++){
					
					String celldata=sheet.getRow(i).getCell(j).getStringCellValue();					
					
					System.out.println(celldata);
				}
						
		}
		
		//System.out.println(str);
		
		
		
		
			
		}
	}


