package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BlueSkyVerify;
import util.BrowserFactory;

public class StepsDefinitions extends pages.BasePage{
	WebDriver driver;
	BlueSkyVerify  blueSky;

	@Before
	public void beforeRun() {
	 driver = BrowserFactory.startBrowser();
	 blueSky = PageFactory.initElements(driver, BlueSkyVerify.class);}

	@Given("^Set SkyBlue Background button exists$")
	public void Set_SkyBlue_Background_button_exist() throws IOException, Throwable{
    driver.get(" http://techfios.com/test/101/");
	Thread.sleep(2000); 
	blueSky.takeScreenshotAtEndOfTest(driver);

	}

    @When("^User click on \"([^\"]*)\" button$")
 	public void user_click_on (String arg1)  throws Throwable    {
    	{  blueSky.clickSetSkyButton();
     	blueSky.takeScreenshotAtEndOfTest(driver);
	throw new PendingException(); 

     }
    }
     @Then("^the background color will change to sky blue$")
     public void the_background_color_will_change_to_sky_blue() throws Throwable  {{
    	blueSky.validateBackgroundColor();
        throw new PendingException(); 
  }
     }


    @When("^User clicks on \"([^\"]*)\" button$")
  	public void user_clicks_on (String arg1)  throws Throwable    {
     	{  blueSky.clickSetWhiteButton();
 	throw new PendingException(); 

}
     }
    @Then("^the background color will change to white blue$")
    public void the_background_color_will_change_to_white_blue() throws Throwable  {{
   	 blueSky.takeScreenshotAtEndOfTest(driver);
   	 Thread.sleep(2000);
    }
 }
   @After
    public void teardown() {
  	driver.close();
    	driver.quit();
    	}

}
