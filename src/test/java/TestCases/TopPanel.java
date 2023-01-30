package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.DriverInitialization;

public class TopPanel extends DriverInitialization{
	
@Test
	
    public void main()  {
    	
    	
        // TODO Auto-generated method stub
       
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")).click();
		WebElement element = driver.findElement(By.cssSelector("#root > div > section > section > header > ul"));
		String color = element.getCssValue("color");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		   SoftAssert softast = new SoftAssert();
		   
	        WebElement menubar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/ul"));
	           String ActualColour = menubar.getCssValue("background-color");
               System.out.println("rgb :"+ActualColour);
              

               String hexcolour = Color.fromString(ActualColour).asHex();
               String ExpectedColour = "rgba(0, 21, 41, 1)";
               
              softast.assertEquals(ActualColour, ExpectedColour);
               softast.assertAll();
		
}           

}
