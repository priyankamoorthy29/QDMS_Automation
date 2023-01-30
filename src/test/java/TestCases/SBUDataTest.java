package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import Base.DriverInitialization;
import Pages.AddSbuPage;

public class SBUDataTest extends DriverInitialization {
	AddSbuPage addSbupg = new AddSbuPage();

	@Test
	public void addSbuButton() throws InterruptedException, IOException {
		PageFactory.initElements(driver, addSbupg);
		driver.navigate().refresh();
		Thread.sleep(1000);
//	click Add SBU Button
		AddSbuPage.AddSbuBtn.click();
		Thread.sleep(3000);
//		Checking Form Heading	
		String expectedSbuFormHeading = "Add SBU";
		String actualSbuFormHeading = AddSbuPage.SbuFormHeading.getText();
		testCase = extent.createTest("SBU Form Heading");
		try {
			Assert.assertEquals(actualSbuFormHeading, expectedSbuFormHeading);
			testCase.log(Status.INFO, "SBU Form Expected Heading :- " + expectedSbuFormHeading);
			testCase.log(Status.INFO, "SBU Form Actual Heading :- " + actualSbuFormHeading);
			testCase.log(Status.PASS, "SBU Form Heading Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Form Expected Heading :- " + expectedSbuFormHeading);
			testCase.log(Status.INFO, "SBU Form Actual Heading :- " + actualSbuFormHeading);
			testCase.log(Status.FAIL, "SBU Form Heading Wrong");
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Form Heading");
		}

//		checking SBU name Heading
		String expectedSbuNameHeading = "Sub Business Unit:";
		String actualSbuNameHeading = AddSbuPage.SbuNameHeading.getText();
		testCase = extent.createTest("SBU Name Heading");
		try {
			Assert.assertEquals(actualSbuNameHeading, expectedSbuNameHeading);
			testCase.log(Status.INFO, "SBU Name Expected Heading :- " + expectedSbuNameHeading);
			testCase.log(Status.INFO, "SBU Name Actual Heading :- " + actualSbuNameHeading);
			testCase.log(Status.PASS, "SBU Name Heading Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Name Expected Heading :- " + expectedSbuNameHeading);
			testCase.log(Status.INFO, "SBU Name Actual Heading :- " + actualSbuNameHeading);
			testCase.log(Status.FAIL, "SBU Name Heading Wrong");
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Name Heading");
		}

//		checking SBU Description Heading
		String expectedSbuDescriptionHeading = "Description:";
		String actualSbuDescriptionHeading = AddSbuPage.SbuDescriptionHeading.getText();
		testCase = extent.createTest("SBU Description Heading");
		try {
			Assert.assertEquals(actualSbuDescriptionHeading, expectedSbuDescriptionHeading);
			testCase.log(Status.INFO, "SBU Description Expected Heading :- " + expectedSbuDescriptionHeading);
			testCase.log(Status.INFO, "SBU Description Actual Heading :- " + actualSbuDescriptionHeading);
			testCase.log(Status.PASS, "SBU Description Heading Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Description Expected Heading :- " + expectedSbuDescriptionHeading);
			testCase.log(Status.INFO, "SBU Description Actual Heading :- " + actualSbuDescriptionHeading);
			testCase.log(Status.FAIL, "SBU Description Heading Wrong");
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Description Heading");
		}

//		checking SBU Name TextBox
		boolean SBUNameTextBox = true;
		boolean expectedSbuNameTextBox = true;
		boolean actualSbuNameTextBox = AddSbuPage.SbuName.isDisplayed();
		testCase = extent.createTest("SBU Name TextBox");
		try {
			Assert.assertEquals(actualSbuNameTextBox, expectedSbuNameTextBox);
			testCase.log(Status.INFO, "SBU Name TextBox Expected Results :- " + expectedSbuNameTextBox);
			testCase.log(Status.INFO, "SBU Name TextBox Actual Results :- " + actualSbuNameTextBox);
			testCase.log(Status.PASS, "SBU Name TextBox Correctly Showing");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Name TextBox Expected Results :- " + expectedSbuNameTextBox);
			testCase.log(Status.INFO, "SBU Name TextBox Actual Results :- " + actualSbuNameTextBox);
			testCase.log(Status.FAIL, "SBU Name TextBox Wrongly Showing");
			SBUNameTextBox = false;
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Name TextBox");
			SBUNameTextBox = false;
		}

//		checking SBU Description TextBox
		boolean SBUDescriptionTextBox = true;
		boolean expectedSbuDescriptionTextBox = true;
		boolean actualSbuDescriptionTextBox = AddSbuPage.SbuName.isDisplayed();
		testCase = extent.createTest("SBU Description TextBox");
		try {
			Assert.assertEquals(actualSbuDescriptionTextBox, expectedSbuDescriptionTextBox);
			testCase.log(Status.INFO, "SBU Description TextBox Expected Results :- " + expectedSbuDescriptionTextBox);
			testCase.log(Status.INFO, "SBU Description TextBox Actual Results :- " + actualSbuDescriptionTextBox);
			testCase.log(Status.PASS, "SBU Description TextBox Correctly Showing");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Description TextBox Expected Results :- " + expectedSbuDescriptionTextBox);
			testCase.log(Status.INFO, "SBU Description TextBox Actual Results :- " + actualSbuDescriptionTextBox);
			testCase.log(Status.FAIL, "SBU Description TextBox not Showing");
			SBUDescriptionTextBox = false;
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Description TextBox");
			SBUDescriptionTextBox = false;
		}

//		Checking Save Button
		boolean SaveButton = true;
		boolean expectedSaveButton = true;
		boolean actualSaveButton = AddSbuPage.Submit.isDisplayed();
		testCase = extent.createTest("SBU Save Button");
		try {
			Assert.assertEquals(actualSaveButton, expectedSaveButton);
			testCase.log(Status.INFO, "SBU Save Button Expected Results :- " + expectedSaveButton);
			testCase.log(Status.INFO, "SBU Save Button Actual Results :- " + actualSaveButton);
			testCase.log(Status.PASS, "SBU Save Button Correctly Showing");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Save Button Expected Results :- " + expectedSaveButton);
			testCase.log(Status.INFO, "SBU Save Button Actual Results :- " + actualSaveButton);
			testCase.log(Status.FAIL, "SBU Save Button Not Showing");
			SaveButton = false;
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Save Button");
			SaveButton = false;
		}

//		Checking Cancel Button
		boolean expectedCancelButton = true;
		boolean actualCancelButton = AddSbuPage.CancelSbuBtn.isDisplayed();
		testCase = extent.createTest("SBU Cancel Button");
		try {
			Assert.assertEquals(actualCancelButton, expectedCancelButton);
			testCase.log(Status.INFO, "SBU Cancel Button Expected Results :- " + expectedCancelButton);
			testCase.log(Status.INFO, "SBU Cancel Button Actual Results :- " + actualCancelButton);
			testCase.log(Status.PASS, "SBU Cancel Button Correctly Showing");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Cancel Button Expected Results :- " + expectedCancelButton);
			testCase.log(Status.INFO, "SBU Cancel Button Actual Results :- " + actualCancelButton);
			testCase.log(Status.FAIL, "SBU Cancel Button Not Showing");
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Cancel Button");
		}

//		Checking Save Name
		String expectedSaveButtonName = "Save";
		String actualSaveButtonName = AddSbuPage.Submit.getText();
		testCase = extent.createTest("SBU Save Button Name");
		try {
			Assert.assertEquals(actualSaveButtonName, expectedSaveButtonName);
			testCase.log(Status.INFO, "SBU Save Button Name Expected Results :- " + expectedSaveButtonName);
			testCase.log(Status.INFO, "SBU Save Button Name Actual Results :- " + actualSaveButtonName);
			testCase.log(Status.PASS, "SBU Save Button Name Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Save Button Name Expected Results :- " + expectedSaveButtonName);
			testCase.log(Status.INFO, "SBU Save Button Name Actual Results :- " + actualSaveButtonName);
			testCase.log(Status.FAIL, "SBU Save Button Name Wrong");

		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Save Button Name");
		}

//		Checking Cancel Name
		String expectedCancelButtonName = "Cancel";
		String actualCancelButtonName = AddSbuPage.CancelSbuBtn.getText();
		testCase = extent.createTest("SBU Cancel Button Name");
		try {
			Assert.assertEquals(actualCancelButtonName, expectedCancelButtonName);
			testCase.log(Status.INFO, "SBU Cancel Button Name Expected Results :- " + expectedCancelButtonName);
			testCase.log(Status.INFO, "SBU Cancel Button Name Actual Results :- " + actualCancelButtonName);
			testCase.log(Status.PASS, "SBU Cancel Button Name Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Cancel Button Name Expected Results :- " + expectedCancelButtonName);
			testCase.log(Status.INFO, "SBU Cancel Button Name Actual Results :- " + actualCancelButtonName);
			testCase.log(Status.FAIL, "SBU Cancel Button Name Wrong");

		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Cancel Button Name");
		}

//		Checking Close button 
		boolean expectedCloseButton = true;
		boolean actualCloseButton = AddSbuPage.CloseBtn.isDisplayed();
		testCase = extent.createTest("SBU Form Close Button");
		try {
			Assert.assertEquals(actualCancelButton, expectedCloseButton);
			testCase.log(Status.INFO, "SBU Form close Button Expected Results :- " + expectedCloseButton);
			testCase.log(Status.INFO, "SBU Form close Button Actual Results :- " + actualCloseButton);
			testCase.log(Status.PASS, "SBU Form close Button Correctly Showing");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "SBU Form close Button Expected Results :- " + expectedCloseButton);
			testCase.log(Status.INFO, "SBU Form close Button Actual Results :- " + actualCloseButton);
			testCase.log(Status.FAIL, "SBU Form close Button Not Showing");
		} catch (NoSuchElementException e) {
			testCase.log(Status.FAIL, "Don't Have SBU Form close Button");
		}

//		close SBU form using Cancel button / close button / refresh
		if (AddSbuPage.CancelSbuBtn.isDisplayed()) {
			AddSbuPage.CancelSbuBtn.click();
		} else if (AddSbuPage.CloseBtn.isDisplayed()) {
			AddSbuPage.CloseBtn.click();
		} else {
			driver.navigate().refresh();
		}
		Thread.sleep(2000);
//		if having SBU name TextBox , SBU Description TextBox and Save Button, Can be add new SBU 
		if (SBUNameTextBox && SBUDescriptionTextBox && SaveButton) {
//			Click Pagination Button
			AddSbuPage.clickPagination.click();
			Thread.sleep(1000);
//			Change pagination to 100/Page 
			AddSbuPage.click100Pagination.click();

			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Data\\Data.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("AddSbu");

			int rowcount = sheet.getLastRowNum();
			for (int i = 0; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);

				boolean check = (boolean) row.getCell(0).getBooleanCellValue();
				String SBU = (String) row.getCell(1).getStringCellValue();
				String Des = (String) row.getCell(2).getStringCellValue();
//				Check checkbox
				if (check == true) {
//					Checking SBU Already Exit or not
					boolean checkAlreadyExit = false;
					for (WebElement ele : AddSbuPage.SbuColumn) {
						String value = ele.getText();
						if (value.contentEquals(SBU)) {
							checkAlreadyExit = true;
							break;
						}
					}

					if (checkAlreadyExit) {
//						System.out.println("Already exist this SBU :- " + SBU);
						testCase = extent.createTest("Add SBU");
						testCase.log(Status.INFO, "Already exist this SBU :- " + SBU);
						testCase.log(Status.PASS, "Pass this test script");
					} else {
//						Add SBU Code
						Thread.sleep(1000);
						AddSbuPage.AddSbuBtn.click();
						Thread.sleep(1000);
						testCase = extent.createTest("Add SBU");
						AddSbuPage.SbuName.sendKeys(SBU);
						AddSbuPage.SbuDes.sendKeys(Des);
						AddSbuPage.Submit.click();
						Thread.sleep(1000);
//						Checking Cancel button & Function
//							if (AddSbuPage.CancelSbuBtn.isDisplayed()) {
//								
//								AddSbuPage.CancelSbuBtn.click();
						//
//							}

//		Checking Added SBU Available or not in SBU Web Table
						boolean CheckAddedValue = false;
						for (WebElement ele : AddSbuPage.SbuColumn) {
							String value = ele.getText();
							Thread.sleep(3000);
							if (value.contentEquals(SBU)) {
								CheckAddedValue = true;
								break;
							}
						}
//		Checking Expeted result & Actual result are equal or not
						boolean addedValueAvailable = true;
						try {
							Assert.assertEquals(CheckAddedValue, true);
						} catch (AssertionError e) {
							addedValueAvailable = false;
						}

//						Checking SBU save Button visible or not after added the value
//						boolean save_button = true;
//						try {
//							Assert.assertEquals(AddSbuPage.Submit.isDisplayed(), false);
//						} catch (AssertionError e) {
//							save_button = false;
//						}

//						SBU adding Final results
						if (addedValueAvailable) {
							System.out.println("This " + SBU + " Available in webtable");
							testCase.log(Status.INFO, "Finded Expected SBU in SBU Webtable");
							testCase.log(Status.INFO, "Added form Closed after added value");
							testCase.log(Status.PASS, "This" + SBU + "added test script Pass");

						} else {
							System.out.println("This " + SBU + " Not available in webtable");
							testCase.log(Status.INFO, "Unable to find Expected SBU in SBU Webtable");
							testCase.log(Status.INFO, "Added form unable to Close after added value");
							testCase.log(Status.FAIL, "This" + SBU + "added test script Fail");
						}

					}
				}
			}
		} else {
			System.out.println("Unable to find SBU Save Button / SBU Name TextBox / SBU Description TextBox");
			testCase = extent.createTest("Save Button");
			testCase.log(Status.INFO, "Don't have SBU name TextBox or SBU Description TextBox or SBU Save Button");
			testCase.log(Status.INFO, "So Cant add SBU");
			testCase.log(Status.FAIL, "Smoke fail");
		}

	}
}
