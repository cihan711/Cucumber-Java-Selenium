package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import selenium_webdriver_javacourse.pages.keyPressPage;
import selenium_webdriver_javacourse.utils.factory.DriverFactory;

public class keyPressStep {

    keyPressPage kp = new keyPressPage(DriverFactory.getDriver());

    @Given("user is on keyPress page")
    public void user_is_on_key_press_page() throws InterruptedException {
        DriverFactory.getDriver().get("https://the-internet.herokuapp.com/key_presses");
        Thread.sleep(20);
    }

    @When("user gets the main title of the keyPress page")
    public void user_gets_the_main_title_of_the_key_press_page() {

        kp.keyPageTitleText();
    }

    @Then("keyPress page main title should be {string}")
    public void keypressPageMainTitleShouldBe(String header) {
        Assert.assertEquals("header yanlis",kp.keyPageGetTitle(),header);
    }

    @Then("user check keyPress page is working")
    public void user_check_key_press_page_is_working() throws InterruptedException {

        kp.writeAndCheckText("Elif");
        kp.getResult();
        Thread.sleep(20);

    }


}
