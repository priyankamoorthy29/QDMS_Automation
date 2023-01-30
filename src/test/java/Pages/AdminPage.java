package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	@FindBy(xpath = "//ul[@class='ant-menu-overflow ant-menu ant-menu-root ant-menu-horizontal ant-menu-dark']/div/div[2]/div/div/span[@class='ant-tag ant-tag-has-color']")
	public static WebElement CheckAdmin ;
	
	

}
