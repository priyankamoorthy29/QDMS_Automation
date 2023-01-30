package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {
	
	@FindBy(xpath="//*[@id ='usernameOrEmail']")
    public static WebElement username;
    
    @FindBy(id="password")
    public static WebElement password;
    
    @FindBy(xpath= "//button[@type]")
    public static WebElement login;
    
    @FindBy (xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/master/plantlevel\"]")
    public static WebElement mastercard;
    
    @FindBy (xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[4]/span/a")
    public static WebElement customerbar;
    
    @FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
    public static WebElement customersitebutton;
    
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[6]/div/button/span")
	public static WebElement AddcustomerButton;
			
			
}
