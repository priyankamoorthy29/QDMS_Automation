package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;
import Pages.CustomerPage;
import Pages.LoginPage;

public class CustomerTest extends DriverInitialization {
	
		
		CustomerPage custbtn = new CustomerPage();
		
		@Test
		    public void adminButton() throws InterruptedException, IOException{
		            
		        
		    PageFactory.initElements(driver,custbtn);
		    
		  
		    
		    Thread.sleep(2000);
			CustomerPage.customerbar.click();
			
			
			Thread.sleep(2000);
			CustomerPage.customersitebutton.click();
			Thread.sleep(2000);
			CustomerPage.addcustomer.click();
		    //adminButton.CheckAdmin.click();

		    
		    
		    SoftAssert aa = new SoftAssert();
		    Point actual = CustomerPage.addcustomer.getLocation();
		    
		    int x = actual.getX();
		    int expectedresult = 970;
		    System.out.println("x-axis = " + x);
		    aa.assertEquals(x, expectedresult);
		    
		    
		    int y = actual.getY();
		    int expectresult =  97;
		    System.out.println("y-axis = " + y);
		    aa.assertEquals(expectresult, y);
		    
		    
		    org.openqa.selenium.Dimension size = CustomerPage.addcustomer.getSize();
		    int width = size.getWidth();
		    System.out.println("width  = " + width);
		    int expectedresult1 =89;
		    aa.assertEquals(width, expectedresult1);    
		     
		    int height = size.getHeight();
		    System.out.println("height = " + height);
		    int expectedresult2 =22;
		    aa.assertEquals(height, expectedresult2);
		    
		    
		    String backgroundColor = CustomerPage.addcustomer.getCssValue("background-color");
		    System.out.println("backgroundclr = " + backgroundColor );
		    String bgc = "rgba(0, 0, 0, 0)";
		    aa.assertEquals(backgroundColor, bgc);
		    
		    
		    
		    
		    String borderColor = CustomerPage.addcustomer.getCssValue("border-color");
		    System.out.println("borderColor = " + borderColor);
		    String bc = "rgb(255, 255, 255)";
		    aa.assertEquals(borderColor, bc);
		    

		    
		    

		    String font = CustomerPage.addcustomer.getCssValue("font-family");
		    System.out.println("Font of button: " + font);
		    String ft = "Roboto, sans-serif";
		    aa.assertEquals(font, ft);
		    
		    
		    
		    String color = CustomerPage.addcustomer.getCssValue("color");
		    System.out.println("Font color of button: " + color);
		    String fontclr = "rgba(255, 255, 255, 1)";
		    aa.assertEquals(fontclr, color);
		    
		    
		     String txt = CustomerPage.addcustomer.getText();
		     System.out.println("text = " + txt);
		     String txxt = "Add Customer";
		     aa.assertEquals(txt, txxt);
		     
		     aa.assertAll();
		    	    
		}
		    
	}

