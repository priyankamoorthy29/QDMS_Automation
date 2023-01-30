package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.DriverInitialization;

public class MaterialTest extends DriverInitialization {
	
Pages.MaterilaPage material = new Pages.MaterilaPage();
	
	@Test
	public void Login () throws InterruptedException {
		
		PageFactory.initElements(driver, material);
		Thread.sleep(2500);
		material.Material.click();
		
	}

}
