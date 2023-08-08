package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import selenium_webdriver_javacourse.pages.HomePage;
import selenium_webdriver_javacourse.pages.dropDownPage;
import selenium_webdriver_javacourse.utils.factory.DriverFactory;

import java.net.MalformedURLException;

public class dropDownStep   {



  dropDownPage dr = new dropDownPage(DriverFactory.getDriver());


// Buralara break-point koyma sebebim driver ların çalışma mantığını görmek içindir!
//BaseTest1.java classında  private WebDriver driver; yaparsan nullpointer hatası dönecektir!

    @Given("user is on dropdown page")
    public void user_is_on_dropdown_page() throws InterruptedException {
       DriverFactory.getDriver().get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(20);
    }
    @When("user gets the main title of the Dropdown page")
    public void user_gets_the_main_title_of_the_dropdown_page() {

        dr.dropDownheaderText() ;

    }

    @Then("dropDownpage main title should be {string}")
    public void dropdownpageMainTitleShouldBe(String header) {

        Assert.assertEquals("header yanlis",dr.dropDownPageGetTitle(),header);
    }



    @When("user check dropdown page is working")
    public void userCheckDropdownPageIsWorking() throws InterruptedException {

        dr.getDropdown();
        dr.listDropdown();

    }


}
