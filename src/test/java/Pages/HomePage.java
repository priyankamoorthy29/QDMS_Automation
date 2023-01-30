package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/a[2]")
	public static WebElement home ;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/div[1]")
	public static WebElement mastertext ;
}
