package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitPage {

	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/master/materiallevel\"]")
	public static WebElement Material;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[6]/div[1]")
	public static WebElement Unit;
	@FindBy(xpath = "//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']")
	public static WebElement AddUnit;
	
}
