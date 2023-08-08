package selenium_webdriver_javacourse.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium_webdriver_javacourse.utils.PageHelper;

public class keyPressPage {


    public WebDriver driver;


    @FindBy(xpath = "//input[@id='target']")
    WebElement textField;

    @FindBy(id = "result")
    WebElement sonuc;

    @FindBy( xpath ="//div/h3[text()='Key Presses']")
    WebElement header;

    public   keyPressPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void keyPageTitleText() {

        PageHelper.pageTitleText(header);
    }


    public String keyPageGetTitle() {

        return PageHelper.getPageTitle(header);
    }

    public void writeAndCheckText(String s){

        PageHelper.writeTextField(textField,s);

    }

    public String getResult(){

        return sonuc.getText();
    }
}




