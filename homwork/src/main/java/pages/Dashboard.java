package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



public class Dashboard extends BasePage{

	WebDriver driver;

	public Dashboard (WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement Background_Color;
	public void validateBackgroundColor() {

		waitForElement(driver, 5, Background_Color);
		Assert.assertEquals(Background_Color.getText(), "skyblue", "Background color not found!!");
	}
	@FindBy(how=How.LINK_TEXT,using ="Techfios")
	WebElement Category_Name;



    public void validateCategoryName() {




	waitForElement(driver, 5, Category_Name);
    Assert.assertEquals(Category_Name.getText(), "Techfios", "Techfios category not found!!");



}
} 