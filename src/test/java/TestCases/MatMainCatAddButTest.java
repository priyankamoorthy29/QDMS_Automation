package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;
import Pages.MatMainCatAddButPages;

public class MatMainCatAddButTest extends DriverInitialization{
	
	MatMainCatAddButPages MMCPage = new MatMainCatAddButPages();
	
	@Test
	public void MMCPage() throws InterruptedException, IOException  {
		
		PageFactory.initElements(driver, MMCPage);
		
	
		Thread.sleep(2000);
		MatMainCatAddButPages.MaterialMainCategoryButton.click();
		
		SoftAssert sa  = new SoftAssert();
        WebElement AddMainMaterialCategoryButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/button"));

        // Find Button Position
        Point ActualLocation = AddMainMaterialCategoryButton.getLocation();
        
        int actual_x = ActualLocation.getX(); 
        int actual_y = ActualLocation.getY();
        
        System.out.println("X axis: "+actual_x); 
        System.out.println("Y axis: "+actual_y);
        
        Point ExpectedLocation = new Point(845,93);
        
        sa.assertEquals(ActualLocation,ExpectedLocation);
        
        // check font size
        
                String ActualfontsSize = AddMainMaterialCategoryButton.getCssValue("font-size"); 
                System.out.println("Font Size: "+ActualfontsSize); 
                String ExpectedfontsSize ="14px";
                
                sa.assertEquals(ActualfontsSize,ExpectedfontsSize);        
                
        // Check the size of the button
                
                Dimension ActualSize = AddMainMaterialCategoryButton.getSize();
                System.out.println("Size :"+ActualSize);
                Dimension ExpectedSize = new Dimension(203,32);
                
                sa.assertEquals(ActualSize,ExpectedSize);
                 
        //Check test button color
                
                String ActualColour = AddMainMaterialCategoryButton.getCssValue("background-color");
                System.out.println("rgb :"+ActualColour);
                String ExpectedColour = "rgba(0, 19, 40, 1)";
        
        
                sa.assertEquals(ActualColour,ExpectedColour);
                sa.assertAll();

		}	

}
