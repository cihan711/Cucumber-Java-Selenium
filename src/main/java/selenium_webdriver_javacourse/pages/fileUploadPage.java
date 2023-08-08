package selenium_webdriver_javacourse.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fileUploadPage {


    public WebDriver driver;


    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement chooseFileButton;

    @FindBy(xpath = "//input[@value='Upload']")
    WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    WebElement uploadedFileName;




    public fileUploadPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    public void chooseFile(String x){

        chooseFileButton.sendKeys(x);
        uploadButton.click();

    }

    public String getResult(){

        return uploadedFileName.getText();
    }

}




