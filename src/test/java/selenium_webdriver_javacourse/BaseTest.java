//package selenium_webdriver_javacourse;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.TestInstance;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import selenium_webdriver_javacourse.pages.HomePage;
//import selenium_webdriver_javacourse.utils.DriverConstant;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class BaseTest implements DriverConstant {
//
//    private WebDriver driver;
//    public HomePage homePage;
//
////    @BeforeAll
////    public void setUp(){
////
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////    }
//
//    @BeforeAll
//    public void setUp() throws MalformedURLException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
////        caps.setBrowserName(browserName);
//        caps.setBrowserName("firefox");
////        driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),caps);
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
//    }
//
//    @BeforeEach
//    public void goHome(){
//        driver.get("https://the-internet.herokuapp.com/");
//        homePage = new HomePage(driver);
//    }
//
//
//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//    }
//
//
//
//
//
//
//}
