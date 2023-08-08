package selenium_webdriver_javacourse.utils.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static selenium_webdriver_javacourse.utils.DriverConstant.runDocker;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * This method is used to initialize the thradlocal driver on the basis of given
     * browser
     *
     * @param browser
     * @return this will return tldriver.
     */
    public WebDriver init_driver(String browser) throws MalformedURLException {

        System.out.println("browser value is: " + browser);

        if(runDocker){

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName("chrome");
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));
        }

        else {
            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
            }
            else if (browser.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver());
            }
            else if (browser.equals("safari")) {
                tlDriver.set(new SafariDriver());
            }
            else {
                System.out.println("Please pass the correct browser value: " + browser);
            }
        }

        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();

    }



    /**
     * this is used to get the driver with ThreadLocal
     *
     * @return
     */
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
}

