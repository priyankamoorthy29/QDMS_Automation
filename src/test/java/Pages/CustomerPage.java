package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[6]/div/button/span")
	public static WebElement addcustomer;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[4]/span/a")
	public static  WebElement   customerbar ; 
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
    public static WebElement customersitebutton;
	
}
