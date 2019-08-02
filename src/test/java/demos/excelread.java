package demos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class excelread {
  @Test
  public void ftestclass() throws IOException {
	  
	  File src = new File("C:\\Data\\datasheet.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  
	  XSSFWorkbook book = new XSSFWorkbook(fis);
	  
	  XSSFSheet sheet1 = book.getSheetAt(0);
	  
		//System.out.println("(1,1) value is " + sheet1.getRow(0).getCell(0).getStringCellValue());
	  
	 for (int i = 0; i < 10; i++) {
		  
		for (int j = 0; j <1; j++) {
			
			System.out.println("(" + i + ","+ j +")value is " + sheet1.getRow(i).getCell(j).getStringCellValue());
			
		}
		
		sheet1.getRow(i).createCell(2).setCellValue("Result: Passed");
		
	}
	 
	 
	 
	 FileOutputStream fos = new FileOutputStream(src);
	 book.write(fos);

	 
	book.close();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  

	  
  }

}
