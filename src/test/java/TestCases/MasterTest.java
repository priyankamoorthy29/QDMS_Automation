package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.DriverInitialization;

public class MasterTest extends DriverInitialization {
	
Pages.MastePage master = new Pages.MastePage();
	
	@Test
	public void Login () {
		
		PageFactory.initElements(driver, master);
		
		master.Master.click();
		

}

}