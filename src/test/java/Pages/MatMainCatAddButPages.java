package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MatMainCatAddButPages {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
	public static WebElement MaterialMainCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/button/span")
	public static WebElement AddMaterialMainCategoryButton; 

}
