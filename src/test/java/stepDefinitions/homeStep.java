package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import selenium_webdriver_javacourse.pages.HomePage;
import selenium_webdriver_javacourse.utils.factory.DriverFactory;

public class homeStep {

 HomePage hm = new HomePage(DriverFactory.getDriver());


    @Given("user is on home page")
    public void user_is_on_home_page() throws InterruptedException {

        DriverFactory.getDriver().get("https://the-internet.herokuapp.com/");
        Thread.sleep(20);
    }
    @When("user gets the main title of the page")
    public void user_gets_the_main_title_of_the_page() {

        hm.homePageTitleText();

    }
    @Then("page main title should be {string}")
    public void page_main_title_should_be(String header) {

        Assert.assertEquals("sayfa headerı farklı, hata var",hm.homePageGetTtile(),header);
    }


}
