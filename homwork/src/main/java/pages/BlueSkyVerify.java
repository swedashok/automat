package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class BlueSkyVerify extends BasePage  {

	WebDriver driver;



	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement Set_Sky_Button;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement Set_White_Button;
	 @FindBy(how = How.XPATH, using = "/html/body")
		WebElement Background_Color;

	public void clickSetSkyButton() {
		Set_Sky_Button.click();

	}
	 public void clickSetWhiteButton() {
		 Set_White_Button.click();
	 }
		public void validateBackgroundColor() {

		waitForElement(driver, 5, Background_Color);
		Assert.assertEquals( "skyblue", "Background color not found!!");
		}



	 public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		  Date date = new Date();
		  String label = formatter.format(date);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  String currrentDir = System.getProperty("user.dir");
		  FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
		 }



}