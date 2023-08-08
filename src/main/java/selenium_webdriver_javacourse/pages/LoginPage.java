package selenium_webdriver_javacourse.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium_webdriver_javacourse.utils.PageHelper;

public class LoginPage {

    public WebDriver driver;


    @FindBy( xpath ="//div/h2[text()='Login Page']")
    WebElement loginHeader;

    @FindBy(id ="username")
    WebElement userName;

    @FindBy(id ="password")
    WebElement password;


    @FindBy(className ="radius")
    WebElement loginButton;

    @FindBy(className ="success")
    WebElement successMessage;

    @FindBy(className ="error")
    WebElement errorMessage;

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logOutButton;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public  void loginheaderText(){

        PageHelper.pageTitleText(loginHeader);
        PageHelper.isDisplayElement(loginHeader);
    }

    public String loginPageGetTitle() {

        return PageHelper.getPageTitle(loginHeader);
    }

    public void sendCredentials(String user,String pass){

        userName.sendKeys(user);
        password.sendKeys(pass);


    }

    public void clickLoginButton() throws InterruptedException {

        loginButton.click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
    }

    public boolean afterLogin(){
       return successMessage.isDisplayed();
    }

    public boolean loginFail(){
        return errorMessage.isDisplayed();
    }



    public void verifyLogOut(){
        Assert.assertTrue(logOutButton.isDisplayed());
        logOutButton.click();
    }
}
