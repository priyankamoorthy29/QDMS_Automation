package TestCases;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;
import Pages.MaterialStatePage;
import Pages.MaterilaPage;

public class MaterialStateTest extends DriverInitialization {
	

	 MaterialStatePage check=new  MaterialStatePage ();

	@Test	 
		 public void  Page() throws InterruptedException,IOException {
			 
		System.out.println("Nilux start");
			 PageFactory.initElements(driver, check);	 
			 Thread.sleep(2000);
			
			 Thread.sleep(2000);
			 MaterialStatePage. materialState.click();
			
//			 Thread.sleep(2000);
//			 materialPage.addMaterial.click();
//		
			SoftAssert sa = new SoftAssert();
			
			                 
			                  //Thread.sleep(2000);
			              //materialPage.addMaterial.click();      
			 //check the Text
           String txt= MaterialStatePage.addMaterial.getText();
           System.out.println("text:"+txt);
           String  expectedText="Add Material State";
           sa.assertEquals(txt,expectedText);           
      
			
			         //check the background color
			              String clour= MaterialStatePage.addMaterial.getCssValue("color");
			              System.out.println("clour:"+clour);
			              String  expectedclour="rgba(255, 255, 255, 1)";
			              sa.assertEquals(clour,expectedclour);           
			         
			            //check the position location

			              Point location= MaterialStatePage.addMaterial.getLocation();
			              System.out.println("location:"+location);
			              int x = location.getX();
			             int y = location.getY();
			               Point expectedLocation  =new Point(608, 93);
			               sa.assertEquals(location,expectedLocation);   
			               

			  			 //check the button size
			  			               Dimension buttonSize = MaterialStatePage.addMaterial.getSize();
			  			                 System.out.println("ButtonSize :"+buttonSize);
			  			                 Dimension expectedButtonSize = new Dimension(145, 32);
			  			                 sa.assertEquals(buttonSize,expectedButtonSize);
			              
//			  check the font size
			                 String fontSize = MaterialStatePage.addMaterial.getCssValue("font-size"); 
			                 System.out.println("Font Size: "+fontSize); 
			                 String expectedfontsSize ="14px";
			                 sa.assertEquals(fontSize,expectedfontsSize);             
//			               //  check the font clour
//			               

			                 
			                 sa.assertAll();         

			                 
			                 
			                 
			                 
			                 
			                 
			                 
			             
			         
			     
			     }
			

}
