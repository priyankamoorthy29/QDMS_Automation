package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterilaPage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]/span/a")
	public static WebElement Material;

}
