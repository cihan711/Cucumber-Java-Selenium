package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import selenium_webdriver_javacourse.pages.HomePage;
import selenium_webdriver_javacourse.pages.LoginPage;
import selenium_webdriver_javacourse.utils.factory.DriverFactory;

public class LoginStep {

 LoginPage lg = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {

       DriverFactory.getDriver().get("https://the-internet.herokuapp.com/login");
       Thread.sleep(20);
    }

    @When("user gets the main title of the Login page")
    public void user_gets_the_main_title_of_the_login_page() {

       lg.loginheaderText();
    }

   @Then("loginPage main title should be {string}")
   public void loginpageMainTitleShouldBe(String header) {
      Assert.assertEquals("header yanlis",lg.loginPageGetTitle(),header);

   }

    @When("user log into correct {string} username and {string} password")
    public void userLogIntoCorrectUsernameAndPassword(String userName, String password) {
        lg.sendCredentials(userName,password);

    }
    @When("user verify to click login button")
    public void user_verify_to_click_login_button() throws InterruptedException {

        lg.clickLoginButton();


    }
    @Then("user should see Secure Area page")
    public void user_should_see_secure_area_page() {

        Assert.assertTrue(lg.afterLogin());
    }
    @When("user verify to click logout button")
    public void user_verify_to_click_logout_button() {

     lg.verifyLogOut();
    }

    @Then("user should see Login page")
    public void user_should_see_login_page() {
        lg.loginheaderText();

    }


    @When("user log into incorrect {}  and correct {string} password")
    public void userLogIntoIncorrectAndCorrectPassword(String usernames, String arg1) {

        lg.sendCredentials(usernames,arg1);
    }

    @Then("user should see Error message")
    public void userShouldSeeErrorMessage() {
        lg.loginFail();
    }

    @When("user log into correct {string} username and incorrect {}")
    public void userLogIntoCorrectUsernameAndIncorrect(String arg0, String passwords) {
        lg.sendCredentials(arg0,passwords);
    }
}
