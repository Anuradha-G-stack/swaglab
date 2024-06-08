package utility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class Parametrization 
{
		public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException 
	      {	
		     FileInputStream file =new FileInputStream("C:\\Users\\admin\\Desktop\\SwagLab\\src\\test\\resources\\testdata.xlsx");
		
	            String Value=WorkbookFactory.create(file).getSheet("sheet2").getRow(row).getCell(cell).getStringCellValue();
        
                  return Value;
            }
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String a=getdata(0,0);
		
		System.out.println(a);
	}
	
   }