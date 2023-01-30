package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SBUButtonTest extends DriverInitialization {
	
	@Test
	public void sbu() throws InterruptedException {
		
		
		Thread.sleep(2000);
		WebElement sbu = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]"));
		sbu.click();
//		
//		WebElement but =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"));
//		String butType ="button";	
//		String buttType =but.getText();
//		System.out.println(buttType);
		
		WebElement addSbu=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"));
		
		Point actuallocation = addSbu.getLocation();
		int x= actuallocation.getX();
		int y= actuallocation.getY();
		System.out.println("X value "+x+" Y value "+y);
		Point expectedloc =new Point(588,93);
		Assert.assertEquals(actuallocation, expectedloc);
		
		int butHeight=addSbu.getSize().getHeight();
		int butWidth =addSbu.getSize().getWidth();
		System.out.println("Button Height is "+butHeight+" "+"width is "+butWidth);
		int expHeight = 32;
		Assert.assertEquals(butHeight, expHeight);
		
		int expWidth =180;
		Assert.assertEquals(butWidth, expWidth);
		
		String fontcol= addSbu.getCssValue("color");
		System.out.println(fontcol);
		String expectedcolor = "rgba(255, 255, 255, 1)";
		//String expectedcolor = "rgba(255, 255, 255, 0)";
		
		Assert.assertEquals(fontcol, expectedcolor);
		
		String buttonBackground =addSbu.getCssValue("backgroundColor");
		System.out.println(buttonBackground);
		String expectedbackground ="rgba(0, 19, 40, 1)";
		//Assert.assertEquals(buttonBackground, expectedbackground);
		Assert.assertEquals(buttonBackground,expectedbackground);
		
		
		
		
	}

}
