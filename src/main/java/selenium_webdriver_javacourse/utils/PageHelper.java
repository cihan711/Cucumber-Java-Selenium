package selenium_webdriver_javacourse.utils;

import org.openqa.selenium.WebElement;

public class PageHelper {


    public static void pageTitleText(WebElement headerText) {

        System.out.println("Sayfanın header-title: " + headerText.getText());
    }



    public static String getPageTitle(WebElement headerText) {

       return headerText.getText();
    }


    public static void writeTextField(WebElement field,String text){

        field.sendKeys(text);

    }


    public static boolean isDisplayElement(WebElement headerText) {

      return headerText.isDisplayed();
    }



}
