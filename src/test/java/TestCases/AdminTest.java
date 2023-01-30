package TestCases;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.AdminPage;

public class AdminTest extends DriverInitialization {
	
	AdminPage adminbtn = new AdminPage();

	@Test
	public void adminButton() throws InterruptedException, IOException {

		PageFactory.initElements(driver, adminbtn);

		
		Thread.sleep(2000);
		// adminButton.CheckAdmin.click();

//	Boolean true1;
//	Boolean False1;
//	

		//SoftAssert aa = new SoftAssert();
		boolean AcctualElement = AdminPage.CheckAdmin.isDisplayed();
		AdminPage.CheckAdmin.isDisplayed();
		boolean ExpectedElement = true;
		//AssertJUnit.assertEquals(AcctualElement, ExpectedElement);

		boolean elementvisible = true;
		testCase = extent.createTest("ELEMENT-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualElement, ExpectedElement);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		Point actual = AdminPage.CheckAdmin.getLocation();

		int x = actual.getX();
		int y = actual.getY();
		//int expectresult = 18;
		//int expectedresult = 1244;
		System.out.println("x-axis = " + x);
		System.out.println("y-axis = " + y);
		
		//aa.assertEquals(x, expectedresult);
		Point expectedresult = new Point(1236, 12);
		testCase = extent.createTest("position");
		boolean position = true;
		
		try {
			AssertJUnit.assertEquals(actual, expectedresult);
		} catch (AssertionError e) {
			position = false;
		}
			if (position) {
				testCase.log(Status.INFO, "ActualElement :- " + actual);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedresult);
				testCase.log(Status.INFO, "correct postion");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actual);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedresult);
				testCase.log(Status.INFO, "wrong postion");
				testCase.log(Status.FAIL, "wrong");
			}
			Thread.sleep(2000);
		
		

		
		
		//AssertJUnit.assertEquals(expectresult, y);

//		boolean y_axis = true;
//		testCase = extent.createTest("x_axis");
//		try {
//			AssertJUnit.assertEquals(AcctualElement, ExpectedElement);
//		} catch (AssertionError e) {
//			y_axis = false;
//
//			if (y_axis) {
//				testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "correct y_axis");
//				testCase.log(Status.PASS, "Correct ");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "wrong y_axis");
//				testCase.log(Status.FAIL, "wrong");
//			}
//
//	}

		Thread.sleep(2000);

		org.openqa.selenium.Dimension size = AdminPage.CheckAdmin.getSize();
		int width = size.getWidth();
		System.out.println("width  = " + width);
		int expectedresult1 = 100;
		//AssertJUnit.assertEquals(width, expectedresult1);
		testCase = extent.createTest("width");
		boolean width1 = true;
		
		try {
			AssertJUnit.assertEquals(width, expectedresult1);
		} catch (AssertionError e) {
			width1 = false;
		}
		if (width1) {
				testCase.log(Status.INFO, "ActualElement :- " + width);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedresult1);
				testCase.log(Status.INFO, "correct width");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + width);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedresult1);
				testCase.log(Status.INFO, "wrong width");
				testCase.log(Status.FAIL, "wrong");
			}

		

		Thread.sleep(2000);

		int height = size.getHeight();
		System.out.println("height = " + height);
		int expectedresult2 = 35;
		//AssertJUnit.assertEquals(height, expectedresult2);

		boolean height1 = true;
		testCase = extent.createTest("height");
		try {
			AssertJUnit.assertEquals(height, expectedresult2);
		} catch (AssertionError e) {
			height1 = false;

		}
		if (height1) {
				testCase.log(Status.INFO, "ActualElement :- " + height);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedresult2);
				testCase.log(Status.INFO, "correct height");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + height);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedresult2);
				testCase.log(Status.INFO, "wrong height");
				testCase.log(Status.FAIL, "wrong");
			}

		

		Thread.sleep(2000);

		String backgroundColor = AdminPage.CheckAdmin.getCssValue("background-color");
		System.out.println("backgroundclr = " + backgroundColor);
		String bgc = "rgba(135, 138, 133, 1)";
		//AssertJUnit.assertEquals(backgroundColor, bgc);
		boolean backgroundColor1 = true;
		testCase = extent.createTest("background-color");
		try {
			AssertJUnit.assertEquals(backgroundColor, bgc);
		} catch (AssertionError e) {
			backgroundColor1 = false;

		}
			if (backgroundColor1) {
				testCase.log(Status.INFO, "ActualElement :- " + backgroundColor);
				testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
				testCase.log(Status.INFO, "correct backgroundColor");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + backgroundColor);
				testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
				testCase.log(Status.INFO, "wrong backgroundColor");
				testCase.log(Status.FAIL, "wrong");
			}

		
		Thread.sleep(2000);

//		String borderColor = AdminPage.CheckAdmin.getCssValue("border-color");
//		System.out.println("borderColor = " + borderColor);
//		String bc = "rgb(255, 255, 255)";
//		//AssertJUnit.assertEquals(borderColor, bc);
//
//		boolean borderColor1 = true;
//		testCase = extent.createTest("borderColor");
//		try {
//			AssertJUnit.assertEquals(borderColor, bc);
//		} catch (AssertionError e) {
//			borderColor1 = false;
//		}
//			if (borderColor1) {
//				testCase.log(Status.INFO, "ActualElement :- " + borderColor);
//				testCase.log(Status.INFO, "ExpectedElement :- " + bc);
//				testCase.log(Status.INFO, "correct borderColor");
//				testCase.log(Status.PASS, "Correct ");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + borderColor);
//				testCase.log(Status.INFO, "ExpectedElement :- " + bc);
//				testCase.log(Status.INFO, "wrong borderColor");
//				testCase.log(Status.FAIL, "wrong");
//			}
//
//	

		Thread.sleep(2000);

//		String font = AdminPage.CheckAdmin.getCssValue("font-family");
//		System.out.println("Font of button: " + font);
//		String ft = "Roboto, sans-serif";
//		//AssertJUnit.assertEquals(font, ft);
//
//		boolean font1 = true;
//		testCase = extent.createTest("font");
//		try {
//			AssertJUnit.assertEquals(font, ft);
//		} catch (AssertionError e) {
//			font1 = false;
//		}
//			if (font1) {
//				testCase.log(Status.INFO, "ActualElement :- " + font);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ft);
//				testCase.log(Status.INFO, "correct font");
//				testCase.log(Status.PASS, "Correct ");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + font);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ft);
//				testCase.log(Status.INFO, "wrong font");
//				testCase.log(Status.FAIL, "wrong");
//			}
//
//		

		Thread.sleep(2000);
		String color = AdminPage.CheckAdmin.getCssValue("color");
		System.out.println("Font color of button: " + color);
		String fontclr = "rgba(255, 255, 255, 1)";
		//AssertJUnit.assertEquals(fontclr, color);

		boolean color1 = true;
		testCase = extent.createTest("color");
		try {
			AssertJUnit.assertEquals(color, fontclr);
		} catch (AssertionError e) {
			color1 = false;
		}
			if (color1) {
				testCase.log(Status.INFO, "ActualElement :- " + color);
				testCase.log(Status.INFO, "ExpectedElement :- " + fontclr);
				testCase.log(Status.INFO, "correct color");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + color);
				testCase.log(Status.INFO, "ExpectedElement :- " + fontclr);
				testCase.log(Status.INFO, "wrong color");
				testCase.log(Status.FAIL, "wrong");
			}

		
		Thread.sleep(2000);

//		String txt = AdminPage.CheckAdmin.getText();
//		System.out.println("text = " + txt);
//		String txxt = "admin";
//		AssertJUnit.assertEquals(txt, txxt);
//
//		boolean txt1 = true;
//		testCase = extent.createTest("color");
//		try {
//			AssertJUnit.assertEquals(txt, txxt);
//		} catch (AssertionError e) {
//			txt1 = false;
//		}
//			if (txt1) {
//				testCase.log(Status.INFO, "ActualElement :- " + txt);
//				testCase.log(Status.INFO, "ExpectedElement :- " + txxt);
//				testCase.log(Status.INFO, "correct text");
//				testCase.log(Status.PASS, "Correct ");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + txt);
//				testCase.log(Status.INFO, "ExpectedElement :- " + txxt);
//				testCase.log(Status.INFO, "wrong text");
//				testCase.log(Status.FAIL, "wrong");
//			}
//
//		

	}
	

}
