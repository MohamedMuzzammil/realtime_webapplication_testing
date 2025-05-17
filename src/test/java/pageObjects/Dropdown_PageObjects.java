package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdown_PageObjects {
	@FindBy(id = "offcanvasNavbarLabel-expand-lg")
	public static WebElement dropDown;
	
	
	@FindBy(xpath  = "//*[@id=\"offcanvasNavbar\"]/div[2]/div/div/div/a[1]")
	public static WebElement dropDownclick;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/h3")
	public static WebElement message;

}
