package TestCases;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;

public class SourceTest extends DriverInitialization {
	
Pages.SourcePage source = new Pages.SourcePage();
	
	@Test
	public void Login () throws InterruptedException, IOException {
		
		PageFactory.initElements(driver,source);
		
		SoftAssert sa  = new SoftAssert();
		Thread.sleep(2500);
		source.Source.click();
		FileInputStream file = new FileInputStream("C:\\Users\\Priyanka\\Documents\\PRIYANKA-ECLIPSE\\Automation_QDMS\\src\\test\\java\\Excel\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("AddSourcebutton");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(0);

			String expectedColor = (String) row.getCell(0).getStringCellValue();
			String expectedBackgroundcolor = (String) row.getCell(1).getStringCellValue();
			String buttonwid=(String) row.getCell(2).getStringCellValue();
			//String expFontSize=(String) row.getCell(3).getStringCellValue();
		

		
		String colr = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button"))
			      .getCssValue("color");
			      //getting background color attribute with getCssValue()
	    String bckgclr = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button"))
			      .getCssValue("background-color");
	    String buttonwidth = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button"))
					      .getCssValue("width");
			      
	    String FontsSize = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button")) .getCssValue("font-size"); 
	
			      System.out.println(colr);
			      System.out.println(bckgclr);
			      System.out.println(buttonwidth);
			      //System.out.println(FontsSize); 
			     
			      sa.assertEquals(expectedColor, colr );
			      sa.assertEquals(expectedBackgroundcolor, bckgclr );
			      sa.assertEquals(buttonwid, buttonwidth );
			    // Assert.assertEquals(expFontSize,FontsSize);	
			     
	}
	}
	}


