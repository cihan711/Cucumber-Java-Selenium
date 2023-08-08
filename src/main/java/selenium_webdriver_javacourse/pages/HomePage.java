package selenium_webdriver_javacourse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium_webdriver_javacourse.utils.PageHelper;

public class HomePage {


    public WebDriver driver;

    @FindBy(className = "heading")
    WebElement homeHeader;


    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }




    public void homePageTitleText() {

        PageHelper.pageTitleText(homeHeader);
    }


    public String homePageGetTtile() {

       return PageHelper.getPageTitle(homeHeader);
    }
}