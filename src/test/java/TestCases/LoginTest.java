package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import Pages.LoginPage;

public class LoginTest extends DriverInitialization {
	
	LoginPage loginpg = new LoginPage();

	@Test
	public void Login() throws InterruptedException, IOException {

		PageFactory.initElements(driver, loginpg);

		Thread.sleep(2000);
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Data\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Login");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(0);

			String uName = (String) row.getCell(0).getStringCellValue();
			String pWord = (String) row.getCell(1).getStringCellValue();
			String expec=(String) row.getCell(2).getStringCellValue();

			
			
			LoginPage.Username.sendKeys(uName);
			LoginPage.Password.sendKeys(pWord);
			LoginPage.LoginButton.click();
			Thread.sleep(2500);
	 		String actualurl= driver.getCurrentUrl();
			System.out.println(actualurl);
			 
			System.out.println(expec);
		
		    Assert.assertEquals(expec, actualurl );
		    
		      
		 
		}
	}



}





