package selenium_webdriver_javacourse.utils;

public interface DriverConstant {

    boolean headless=Boolean.parseBoolean(System.getProperty("headless"));
    boolean remote = Boolean.parseBoolean(System.getProperty("remote"));
    String  remoteKey = System.getProperty("key");
    String  browserName = System.getProperty("browser");
    boolean runDocker = Boolean.parseBoolean(System.getProperty("runDocker"));
    String[] defaultOptions = {"start-maximized","enable-automation","--disable-popup-blocking"};
}
