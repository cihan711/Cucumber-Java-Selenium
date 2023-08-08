package selenium_webdriver_javacourse.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import selenium_webdriver_javacourse.utils.PageHelper;


import java.util.List;

import static org.junit.Assert.*;

public class dropDownPage    {

    public WebDriver driver;

    @FindBy(linkText ="Dropdown")
    WebElement dropDown;

    @FindBy(id ="dropdown")
    WebElement staticDropdown;

    @FindBy( xpath ="//div/h3[text()='Dropdown List']")
    WebElement header;


    public   dropDownPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    private Select findDropDownElement(){
        return new Select(staticDropdown);
    }


    public  void dropDownheaderText(){

        PageHelper.pageTitleText(header);
    }


    public String dropDownPageGetTitle() {

        return PageHelper.getPageTitle(header);
    }

    public void getDropdown() throws InterruptedException {
      // Select dropdown = new Select(staticDropdown);
        findDropDownElement().selectByVisibleText("Option 1");
Thread.sleep(2);
    }

    public void listDropdown(){
      // Select dropdown = new Select(staticDropdown);
        List<WebElement> allOptions = findDropDownElement().getAllSelectedOptions();
        for (WebElement option:allOptions){

            System.out.println(option.getText());
        }


    }



}
