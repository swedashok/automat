package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
	}

	public int randomGenerator(int boundryNumber) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(boundryNumber);
		return randomNumber;

	}

	public void selectDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);}

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