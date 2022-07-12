package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {	static WebDriver driver;

public static WebDriver startBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok\\Desktop\\cucumber1\\homwork\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://techfios.com/test/101/");
	return driver;
}






}