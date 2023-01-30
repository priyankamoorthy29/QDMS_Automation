package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Base.DriverInitialization;
import Pages.BellIconPage;

public class BellNotification extends DriverInitialization {

	BellIconPage bellicon = new BellIconPage();
	
	@Test
	public void bellicon () throws InterruptedException {
		
		
	
		PageFactory.initElements(driver, bellicon);
		
	Thread.sleep(3000);

	Point location = BellIconPage.bell.getLocation();
	System.out.println(location);					
	Point expectedLocation = new Point(1186, 18);

	Dimension size_of_icon = BellIconPage.bell.getSize();
	System.out.println(size_of_icon);
	Dimension expected_size_of_icon = new Dimension(18, 18);

	String colo = BellIconPage.bell.getCssValue("color");
	String expected_color = "rgba(0, 0, 255, 1)";
	System.out.println(colo );

	SoftAssert sa = new SoftAssert();
	sa.assertEquals(size_of_icon, expected_size_of_icon);
	sa.assertEquals(location, expectedLocation);
	sa.assertEquals(colo, expected_color);
	sa.assertAll();

	}
}
