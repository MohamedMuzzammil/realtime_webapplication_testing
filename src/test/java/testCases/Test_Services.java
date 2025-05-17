package testCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonFunctions.CommonFunctions;
import pageObjects.Dropdown_PageObjects;

public class Test_Services extends CommonFunctions {
	@Test
	public void verifyServices() throws InterruptedException {
		PageFactory.initElements(driver, Dropdown_PageObjects.class);
		Dropdown_PageObjects.dropDown.click();

		Dropdown_PageObjects.dropDownclick.click();

		
		  String actualMessage = Dropdown_PageObjects.message.getText();
		  Assert.assertEquals(actualMessage,
		  "Transforming Development and Operations");
		 
		 
	}
}