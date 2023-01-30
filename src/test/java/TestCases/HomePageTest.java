package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;
import Pages.HomePage;

public class HomePageTest extends DriverInitialization{
	
	HomePage loginnew = new HomePage();
	@Test
	public void mainn() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

//		PageFactory.initElements(driver, loginnew);
//		
//		
//		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\hrm\\src\\test\\java\\excel\\gobi.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("login");
//		
//		
//		int rowcount = sheet.getLastRowNum();
//		for(int i=0; i<=rowcount; i++)
//		{
//			XSSFRow row = sheet.getRow(i);
//			
//			String uName = (String)row.getCell(0).getStringCellValue();
//			String pWord = (String)row.getCell(1).getStringCellValue();
//			
//			//Character uName = (Character)row.getCell(0)
//
//					
//	}
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]"));
		Dimension homelogo = home.getSize();
		
		WebElement image = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]/div")); 
		
		String imageurl ="http://192.168.1.36:3000/static/media/homebtn.4acad38d.png";
		String actualUrl = driver.getCurrentUrl();
		
		
		Point actualresult = HomePage.home.getLocation();
		
	        int x = actualresult.getX();
			int y = actualresult.getY();
			SoftAssert sa = new SoftAssert();
								
			    sa.assertEquals(220,x);
				sa.assertEquals(0,y);
		
				
			int height = homelogo.getHeight();
			int width = homelogo.getWidth();
				
		       sa.assertEquals(55,height);
			   sa.assertEquals(55,width);
		

		
  sa.assertAll();		
}	

}
