package utils;

import org.openqa.selenium.*;
import driverManager.InitialDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomWaiters {

    protected WebDriver driver = InitialDriver.getInstance().getDriver();

    private WebElement getWebElement(ExpectedCondition<WebElement> webElementExpectedCondition) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.pollingEvery(Duration.ofMillis(1));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.ignoring(TimeoutException.class);
        wait.ignoring(InterruptedException.class);
        wait.ignoring(UnknownError.class);
        return wait.until(webElementExpectedCondition);
    }

    public WebElement waitUntilClickable(WebElement element) {
        return getWebElement(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitUntilVisible(WebElement element) {
        return getWebElement(ExpectedConditions.visibilityOf(element));
    }
}
