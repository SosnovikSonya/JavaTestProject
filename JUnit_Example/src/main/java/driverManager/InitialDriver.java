package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialDriver {

    private static InitialDriver instance = null;
    private WebDriver driver;

    private InitialDriver() {
    }

    public static InitialDriver getInstance() {
        if (instance == null) {
            instance = new InitialDriver();
        }
        return instance;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
            return driver;
        } else {
            return driver;
        }
    }

    public void destroy() {
        if (driver != null) {
            getDriver().quit();

            driver = null;
        }
    }
}
