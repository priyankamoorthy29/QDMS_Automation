package TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;


public class LoginButtonTest extends DriverInitialization {
	

	 @Test
	 
	 public void LoginButtonTest() throws InterruptedException {
		 
		 WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button"));
		 
		 
		 // check if element visible
		 
		 boolean ActualElement = LoginButton.isDisplayed();
		 boolean ExpectedElement = true;
		 
		 
		  boolean visibility = true;
          testCase = extent.createTest("ELEMENT-VISIBILITY");
          try {
              AssertJUnit.assertEquals(ActualElement,ExpectedElement);
              
          } catch (AssertionError e) {
        	  visibility=false;
          }
          if (visibility) {
              testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
              testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
              testCase.log(Status.PASS,"Correct Element");
          } else {
              testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
              testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
              testCase.log(Status.FAIL,"No element");
          }
              Thread.sleep(2000);
		 
		 
		 
		 // check position
		 
		 Point ActualLocation = LoginButton.getLocation();
		 
		 int actual_x = ActualLocation.getX();
		 int actual_y = ActualLocation.getY();
		 
		 System.out.println("X axis: "+actual_x);
		 System.out.println("Y axis: "+actual_y);
		 
		 Point ExpectedLocation = new Point (1017,411);
		 
		 boolean Position = true;
	        testCase = extent.createTest("BUTTON-POSITION");
	        try {
	            AssertJUnit.assertEquals(ActualLocation,ExpectedLocation);
	            
	        } catch (AssertionError e) {
	        	Position=false;
	        }
	        if (Position) {
	            testCase.log(Status.INFO,"ActualFontSize :- " + ActualLocation);
	            testCase.log(Status.INFO,"ExpectedFontSize :- " + ExpectedLocation);
	            testCase.log(Status.PASS,"Correct Location");
	        } else {
	            testCase.log(Status.INFO,"ActualSize :- " + ActualLocation);
	            testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedLocation);
	            testCase.log(Status.FAIL,"Wrong Location");
	        }
	            Thread.sleep(2000);
		 
		 
		 
		 
//		 check font size
		 
		 String ActualFontSize = LoginButton.getCssValue("font-size");
		 System.out.println("Font Size: " +ActualFontSize);
		 String ExpectedFontSize = "14px";
		 
		 boolean Fontsize = true;
	        testCase = extent.createTest("FONT-SIZE");
	        try {
	            AssertJUnit.assertEquals(ActualFontSize,ExpectedFontSize);
	            
	        } catch (AssertionError e) {
	        	Fontsize=false;
	        }
	        if (Fontsize) {
	            testCase.log(Status.INFO,"ActualFontSize :- " + ActualFontSize);
	            testCase.log(Status.INFO,"ExpectedFontSize :- " + ExpectedFontSize);
	            testCase.log(Status.PASS,"Correct Font Size");
	        } else {
	            testCase.log(Status.INFO,"ActualSize :- " + ActualFontSize);
	            testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedFontSize);
	            testCase.log(Status.FAIL,"Wrong Font Size");
	        }
	            Thread.sleep(2000);
		 
		 
		 
//		 check the size 
		 
		 Dimension ActualSize = LoginButton.getSize();
		 System.out.println("Size : "+ActualSize);
     	 Dimension ExpectedSize = new Dimension(122, 38);
		 		
     	 
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
            testCase.log(Status.PASS,"Correct Size");
        } else {
            testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
            testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
            testCase.log(Status.FAIL,"Wrong Size");
        }
            Thread.sleep(2000);
            
                       
            
            
//            check the enable
            
              
                
            boolean ActualElementEnable=LoginButton.isEnabled();
            boolean ExpectedElementEnable=true;         
                
                boolean enablity = true;
                testCase = extent.createTest("BUTTON-ENABLE");
                try {
                    AssertJUnit.assertEquals(ActualElementEnable,ExpectedElementEnable);
                    
                } catch (AssertionError e) {
                	enablity=false;
                }
                if (enablity) {
                    testCase.log(Status.INFO,"ActualElementEnable :- " + ActualElementEnable);
                    testCase.log(Status.INFO,"ExpectedElementEnable :- " + ExpectedElementEnable);
                    testCase.log(Status.PASS,"Element enable");
                } else {
                    testCase.log(Status.INFO,"ActualElementEnable :- " + ActualElementEnable);
                    testCase.log(Status.INFO,"ExpectedElementEnable :- " + ExpectedElementEnable);
                    testCase.log(Status.FAIL,"Element is not enable");
                }
                    Thread.sleep(2000);
            
            
//            check the button color
            
            
            
                    String ActualButtonColor = LoginButton.getCssValue("background-color");
                    System.out.println("rgb :"+ActualButtonColor);
                    
                    
                    
                    String ExpectedButtonColor = "rgba(15, 46, 67, 1)";
                    
                    
                    boolean buttoncolor = true;
                    testCase = extent.createTest("BUTTON-COLOR");
                    try {
                        AssertJUnit.assertEquals(ActualButtonColor,ExpectedButtonColor);
                        
                    } catch (AssertionError e) {
                    	buttoncolor=false;
                    }
                    if (buttoncolor) {
                        testCase.log(Status.INFO,"ActualButtonColor :- " + ActualButtonColor);
                        testCase.log(Status.INFO,"ExpectedButtonColor :- " + ExpectedButtonColor);
                        testCase.log(Status.PASS,"Correct Button Color");
                    } else {
                        testCase.log(Status.INFO,"ActualButtonColor :- " + ActualButtonColor);
                        testCase.log(Status.INFO,"ExpectedButtonColor :- " + ExpectedButtonColor);
                        testCase.log(Status.FAIL,"Wrong Button Color");
                    }
                        Thread.sleep(2000);
            
            
//            check the border color
//            
//            
//                        String ActualBorderColor = LoginButton.getCssValue("border-colour");
//                        System.out.println("rgb :"+ActualBorderColor);
//                        
//
//                        String ExpectedBorderColor = "rgba(0, 19, 40, 1)";
//                        
//                        boolean bordercolor = true;
//                        testCase = extent.createTest("BORDER-COLOR");
//                        try {
//                            AssertJUnit.assertEquals(ActualBorderColor,ExpectedBorderColor);
//                            
//                        } catch (AssertionError e) {
//                        	bordercolor=false;
//                        }
//                        if (bordercolor) {
//                            testCase.log(Status.INFO,"ActualBorderColor :- " + ActualBorderColor);
//                            testCase.log(Status.INFO,"ExpectedBorderColor :- " + ExpectedBorderColor);
//                            testCase.log(Status.PASS,"Correct Border Color");
//                        } else {
//                            testCase.log(Status.INFO,"ActualBorderColor :- " + ActualBorderColor);
//                            testCase.log(Status.INFO,"ExpectedBorderColor :- " + ExpectedBorderColor);
//                            testCase.log(Status.FAIL,"Wrong Border Color");
//                        }
//                            Thread.sleep(2000);
            
            
                    
                    
                    
                    
//            check the font type 
            
            
//                    String ActualFontType = LoginButton.getCssValue("font-type"); 
//                    System.out.println("Font type: "+ActualFontType); 
                    
                    //String ExpectedfontsType ="14px";
            
                            
                            
//                            boolean fonttype = true;
//                            testCase = extent.createTest("FONT-TYPE");
//                            try {
//                                AssertJUnit.assertEquals(ActualFontType,ExpectedFontType);
//                                
//                            } catch (AssertionError e) {
//                            	fonttype=false;
//                            }
//                            if (fonttype) {
//                                testCase.log(Status.INFO,"ActualFontType :- " + ActualFontType);
//                                testCase.log(Status.INFO,"ExpectedFontType :- " + ExpectedFontType);
//                                testCase.log(Status.PASS,"Correct Font Type");
//                            } else {
//                                testCase.log(Status.INFO,"ActualFontType :- " + ActualFontType);
//                                testCase.log(Status.INFO,"ExpectedFontType :- " + ExpectedFontType);
//                                testCase.log(Status.FAIL,"Wrong Font Type");
//                            }
//                                Thread.sleep(2000);
            
            
            
            
            
            
            
            
	 }
		
		

	}

