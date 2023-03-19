package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
  
	
	
	public static void cpatureScrenShot(String testID,WebDriver driver) throws IOException
	{
		//Name - Test-testID Date&Time
		//eg  - Test1234 31/03/2023 14:10:00
		      
		 //current date find system
    
    	 SimpleDateFormat dateFormat= new SimpleDateFormat(" dd.MM.yyyy HH.mm.SS") ;
    	 Date date =new Date();
    	 String d  =  dateFormat.format(date);//datetime
    	 System.out.println(d);

		
//		random number generate
		   double c=Math.random();
		   System.out.println(c);
		   
	      File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\chama\\OneDrive\\Desktop\\Excel\\Test-"+ testID+"-"+ d+"-"+c+".png");
		  FileHandler.copy(src, dest);
		
	       
	}
	
		
		//excel sheet data 
		public static String getDataFromExelSheet(String sheet, int row, int column) throws EncryptedDocumentException, IOException 
		{
			FileInputStream file = new FileInputStream("C:\\Users\\chama\\OneDrive\\Desktop\\Excel\\Book5.xlsx");
			Cell expectedCell =WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(column);
			
			String data="";
			
			try 
			{
				  data = expectedCell.getStringCellValue();
		     }
			catch(IllegalStateException ise)
			{
				double numCellValue= expectedCell.getNumericCellValue();
				//cellValue=NumCellValue+"";
				data = Double.toString(numCellValue);
				
			}
			catch(Exception e) 
			{
				e.printStackTrace();
				e.getMessage();
			}
			return data;
		
	
		
	}


	

	
	
	
	
	
	
	
	
	
	
}
