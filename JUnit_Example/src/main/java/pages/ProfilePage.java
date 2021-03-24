package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CustomWaiters;
import utils.PageObject;

public class ProfilePage extends PageObject {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@class, 'legouser__current-account')]//child::*[@class='user-account__name']")
    private WebElement userLoginName;

    @FindBy(xpath = "//span[contains(text(), 'Выйти')]")
    private WebElement logoutBtn;

    @Step("Get user name")
    public String getUserName() {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilVisible(userLoginName);
        return userLoginName.getText();
    }

    @Step("Click on user name")
    public void ClickOnUserName() {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilClickable(userLoginName);
        userLoginName.click();
    }

    @Step("Logout")
    public void userLogout() {
        ClickOnUserName();
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilClickable(logoutBtn);
        logoutBtn.click();
    }
}


