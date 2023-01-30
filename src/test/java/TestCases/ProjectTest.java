package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;
import Pages.ProjectPage;

public class ProjectTest extends DriverInitialization {
	
	@Test
	public void addNewCustomer() throws InterruptedException {
		
	
		
		PageFactory.initElements(driver, ProjectPage.class);
		SoftAssert sa  = new SoftAssert();
	
		ProjectPage.customer.click();
		ProjectPage.addProjectButton.click();
		
		Point location = ProjectPage.addProjectButton.getLocation();
	
		

		
		ProjectPage.selectPlant.click();
		Thread.sleep(3200); 
		
		ProjectPage.selectPlant1.sendKeys("RMC Anuradhapura Plant");
		
		
		for (int i = 0; i < ProjectPage.dynamicList.size(); i++) {
		String text=ProjectPage.dynamicList.get(i).getText();
		if (text.contains("RMC Anuradhapura Plant")) {
			ProjectPage.dynamicList.get(i).click();
			break;
		} 
	}
		ProjectPage.selectPlant1.sendKeys(Keys.ENTER);
		
		ProjectPage.enterProjectName.sendKeys("Kabil_Project06");
		Thread.sleep(3200);
		
		ProjectPage.enterCustomer1.click();
		ProjectPage.enterCustomer2.sendKeys("RR Construction pvt Ltd");
		Thread.sleep(3200);
		ProjectPage.enterCustomer2.sendKeys(Keys.ENTER);
				
		ProjectPage.selectContactPerson.sendKeys("Kabil_Contact08");
		ProjectPage.enterContactNumber.sendKeys("0779434695");
		ProjectPage.selectDate.sendKeys("2022-12-17");
		ProjectPage.selectDate.sendKeys(Keys.RETURN);
		ProjectPage.subProBut.click();
		
Point expectedLocation = new Point(102, 32);
        
        Dimension size_of_icon = ProjectPage.addProjectButton.getSize();
        System.out.println(size_of_icon);
    
        

        
        String colo = ProjectPage.addProjectButton.getCssValue("color");
        System.out.println(location);
        String expected_color = "rgb(255, 255, 255, 1)";
        sa.assertEquals(expectedLocation,location);
        sa.assertEquals(colo, expected_color);

		
	
	}
}
