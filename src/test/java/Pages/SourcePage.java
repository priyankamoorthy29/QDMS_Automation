package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SourcePage {
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[4]")
	public static WebElement Source;
	
	@FindBy(xpath = "//*[@id=\\\"root\\\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button")
	public static WebElement Sourceaddbutton;
	
	

}
