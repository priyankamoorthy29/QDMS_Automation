package TestCases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.DriverInitialization;




public class AddPlantButtoncheck extends DriverInitialization 


{
	
	//AddPlantPage Addplantpage = new AddPlantPage();
	
	@Test
	public void AddPlantButtoncheck() throws InterruptedException , IOException
	{
		//PageFactory.initElements(driver, Addplantpage);
		
		SoftAssert sa = new SoftAssert();
		WebElement AddPlantButton = driver.findElement(By.xpath("//*[@id=\"addPlant\"]"));
		
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report/Automation.html");
//		
//		ExtentReports extent = new ExtentReports();
//		
//		extent.attachReporter(reporter);
//		
		
		
		
		 //check if element visible
		
		boolean AcctualElement=AddPlantButton.isDisplayed();
        boolean ExpectedElement=true;
        
        
  
        boolean elementvisible = true;
        testCase = extent.createTest("ELEMENT-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualElement,ExpectedElement);
		} catch (AssertionError e) {
			elementvisible=false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO,"Element Available");
			testCase.log(Status.PASS,"Correct element");
		} else {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO,"Element not available");
			testCase.log(Status.FAIL,"No Element");
		}
			Thread.sleep(2000);	
		
			
			
		//Check position
		
		Point ActualLocation = AddPlantButton.getLocation();
        
        int actual_x = ActualLocation.getX();
        int actual_y = ActualLocation.getY();
		
		System.out.println("X axis: "+actual_x);
		System.out.println("Y axis: "+actual_y);
		
		
		
		Point ExpectedLocation = new Point(1154,93);
		
		
		 testCase = extent.createTest("POSITION");
		 
		 boolean position=true;
		 
			try {
				AssertJUnit.assertEquals(ActualLocation,ExpectedLocation);
				
			} catch (AssertionError  e) {
				position=false;
				
			}
			if (position) {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"Correct Position");
				testCase.log(Status.PASS,"Position correct");
			} else {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"wrong Position");
				testCase.log(Status.FAIL,"Position Wrong");
			}
				Thread.sleep(2000);	
				
				
				
		// check font size
		
				String ActualfontsSize = AddPlantButton.getCssValue("font-size"); 
				System.out.println("Font Size: "+ActualfontsSize); 
				testCase = extent.createTest("FONT-SIZE");
				String ExpectedfontsSize ="14px";
				boolean fontsize = true;
				try {
					AssertJUnit.assertEquals(ActualfontsSize, ExpectedfontsSize);
				} catch (AssertionError e) {
					fontsize=false;
				}
				if (fontsize) {
					testCase.log(Status.INFO,"ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO,"ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO,"Correct font-size");
					testCase.log(Status.PASS,"Font-size Correct");
				} else {
					testCase.log(Status.INFO,"ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO,"ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO,"Wrong font-size");
					testCase.log(Status.FAIL,"Font-size Wrong");
				}
					Thread.sleep(2000);	
				 
				
					// Check the size
				
				Dimension ActualSize = AddPlantButton.getSize();
				System.out.println("Size :"+ActualSize);
				Dimension ExpectedSize = new Dimension(180,32);
				
				
				boolean size = true;
				testCase = extent.createTest("BUTTON-SIZE");
				try {
					AssertJUnit.assertEquals(ActualSize,ExpectedSize);
				} catch (AssertionError e) {
					size=false;
				}
				if (size) {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"Correct Size");
					testCase.log(Status.PASS,"Correct Size");
				} else {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"wrong Size");
					testCase.log(Status.FAIL,"wrong Size");
				}
					Thread.sleep(2000);	
				
				
		//Check test button color
				
				String ActualColour = AddPlantButton.getCssValue("background-color");
				System.out.println("rgb :"+ActualColour);
				
				
				//String hexcolour = Color.fromString(ActualColour).asHex();
				String ExpectedColour = "rgba(0, 19, 40, 1)";
		
		
				
				
				boolean colour = true;
				
				testCase = extent.createTest("BUTTON-COLOUR");
				try {
					AssertJUnit.assertEquals(ActualColour,ExpectedColour);
				} catch (AssertionError e) {
					colour=false;
				}
				if (colour) {
					testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO,"Correct Colour");
					testCase.log(Status.PASS,"Correct Colour");
				} else {
					testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO,"wrong Colour");
					testCase.log(Status.FAIL,"wrong Colour");
				}
					Thread.sleep(2000);	
				
					// check font colour
					
					String ActualfontColor = AddPlantButton.getCssValue("color");
				    System.out.println("Font color of button: " + ActualfontColor);
				    String ExpectedfontColor= "rgba(237, 232, 232, 1)";
				    
				    
				    boolean fontColour = true;
					
					testCase = extent.createTest("BUTTON-FONT-COLOUR");
					try {
						AssertJUnit.assertEquals(ActualfontColor,ExpectedfontColor);
					} catch (AssertionError e) {
						fontColour =false;
					}
					if (fontColour ) {
						testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
						testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedfontColor);
						testCase.log(Status.INFO,"Correct font Colour");
						testCase.log(Status.PASS,"Correct font Colour");
					} else {
						testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
						testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedfontColor);
						testCase.log(Status.INFO,"wrong font Colour");
						testCase.log(Status.FAIL,"wrong font Colour");
					}
						Thread.sleep(2000);	
				
				//sa.assertAll();
//		if(Actual==Expected)
//		{
//			System.out.println("Correct colour");
//		}
//		else
//		{
//			System.out.println("Wrong colour");
//		}
		
//		
//				ExtentTest logger = extent.createTest("Login Test");
//				logger.log(Status.INFO,"Login to HRM");
//				logger.log(Status.PASS,"Login Verified");
//				extent.flush();
//		
		
		
		
		
		
	}

	//private void assertTrue(Point actualLocation, Point expectedLocation) {
		// TODO Auto-generated method stub
		
	}
	
	

