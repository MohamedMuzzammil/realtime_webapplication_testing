package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_PageObjects {
	@FindBy(xpath  = "//*[@id=\"offcanvasNavbar\"]/div[2]/div/a[6]")
	public static WebElement contactButton;
	@FindBy(xpath  = "//*[@id=\"root\"]/div/div[4]/div[1]/ul/li[2]")
	public static WebElement checkAddress;
}
