package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Base.DriverInitialization;
import Pages.UnitPage;

public class UnitTest extends DriverInitialization {
//	LoginPage lp = new LoginPage();
//	MastePage master = new MastePage();
	UnitPage up = new UnitPage();

//	@BeforeTest
//	public void Login() throws InterruptedException {
//		PageFactory.initElements(driver, lp);
//		PageFactory.initElements(driver, master);
//		LoginPage.Username.sendKeys("admin");
//		LoginPage.Password.sendKeys("tokyo@admin");
//		LoginPage.LoginButton.click();
//		Thread.sleep(2000);
//		master.Master.click();
//
//	}

	@Test
	public void Unit() throws InterruptedException {
		PageFactory.initElements(driver, up);
//		UnitPage.Material.click();
		Thread.sleep(1000);
		UnitPage.Unit.click();

//		Check Button Displayed or not
		boolean ExpectedButtonVisible = true;
		boolean actualButtonVisible = UnitPage.AddUnit.isDisplayed();
		testCase = extent.createTest("UNIT-ELEMENT-VISIBLE");
		try {
			Assert.assertEquals(actualButtonVisible, ExpectedButtonVisible);
			testCase.log(Status.INFO, "ActualElement :- " + actualButtonVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedButtonVisible);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
			Thread.sleep(2000);

//			check font size
			boolean ExpectedButtonEnable = true;
			boolean actualButtonEnable = UnitPage.AddUnit.isEnabled();
			testCase = extent.createTest("UNIT-ELEMENT-Enable");
			try {
				Assert.assertEquals(actualButtonEnable, ExpectedButtonEnable);
				testCase.log(Status.INFO, "ActualfontsSize :- " + actualButtonEnable);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedButtonEnable);
				testCase.log(Status.INFO, "Correct font-size");
				testCase.log(Status.PASS, "Font-size Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + actualButtonEnable);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedButtonEnable);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");
			}
			Thread.sleep(2000);
			
//			Check position
			Point ActualLocation = UnitPage.AddUnit.getLocation();
			Point ExpectedLocation = new Point(633, 93);
			testCase = extent.createTest("UNIT-POSITION");
			try {
				Assert.assertEquals(ActualLocation, ExpectedLocation);
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO, "Correct Position");
				testCase.log(Status.PASS, "Position correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO, "wrong Position");
				testCase.log(Status.FAIL, "Position Wrong");
			}
			Thread.sleep(2000);

//			check font size
			String ActualfontsSize = UnitPage.AddUnit.getCssValue("font-size");
			String ExpectedfontsSize = "14px";
			testCase = extent.createTest("UNIT-FONT-SIZE");
			try {
				Assert.assertEquals(ActualfontsSize, ExpectedfontsSize);
				testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
				testCase.log(Status.INFO, "Correct font-size");
				testCase.log(Status.PASS, "Font-size Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");
			}
			Thread.sleep(2000);

//			Check Button the size
			Dimension ActualSize = UnitPage.AddUnit.getSize();
			Dimension ExpectedSize = new Dimension(120, 32);
			testCase = extent.createTest("UNIT-BUTTON-SIZE");
			try {
				Assert.assertEquals(ActualSize, ExpectedSize);
				testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
				testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
				testCase.log(Status.INFO, "Correct Size");
				testCase.log(Status.PASS, "Correct Size");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
				testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
				testCase.log(Status.INFO, "wrong Size");
				testCase.log(Status.FAIL, "wrong Size");
			}
			Thread.sleep(2000);

//			Check test button color
			String ActualColour = UnitPage.AddUnit.getCssValue("background-color");
			String ExpectedColour = "rgba(0, 19, 40, 1)";
			testCase = extent.createTest("UNIT-BUTTON-COLOUR");
			try {
				Assert.assertEquals(ActualColour, ExpectedColour);
				testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
				testCase.log(Status.INFO, "Correct Colour");
				testCase.log(Status.PASS, "Correct Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
				testCase.log(Status.INFO, "wrong Colour");
				testCase.log(Status.FAIL, "wrong Colour");
			}
			Thread.sleep(2000);

//			check font colour
			String ActualfontColor = UnitPage.AddUnit.getCssValue("color");
			String ExpectedfontColor = "rgba(255, 255, 255, 1)";
			testCase = extent.createTest("UNIT-BUTTON-FONT-COLOUR");
			try {
				Assert.assertEquals(ActualfontColor, ExpectedfontColor);
				testCase.log(Status.INFO, "ActualColour :- " + ActualfontColor);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
				testCase.log(Status.INFO, "Correct font Colour");
				testCase.log(Status.PASS, "Correct font Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualColour :- " + ActualfontColor);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
				testCase.log(Status.INFO, "wrong font Colour");
				testCase.log(Status.FAIL, "wrong font Colour");
			}
			Thread.sleep(2000);
			
//			Check border colour 
			String ActualBorderColour = UnitPage.AddUnit.getCssValue("border-color");
			String ExpectedBorderColour = "rgb(255, 255, 255)";
			testCase = extent.createTest("UNIT-BORDER-COLOUR");
			try {
				Assert.assertEquals(ActualBorderColour, ExpectedBorderColour);
				testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
				testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
				testCase.log(Status.INFO, "Correct Border Colour");
				testCase.log(Status.PASS, "Correct Border Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
				testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
				testCase.log(Status.INFO, "wrong border Colour");
				testCase.log(Status.FAIL, "wrong border Colour");
			}
			Thread.sleep(2000);

		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + actualButtonVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedButtonVisible);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "Not Visuale Element");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "Dont Have This Element Locater");
		}

	}

}
