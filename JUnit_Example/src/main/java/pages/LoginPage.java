package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CustomWaiters;
import utils.PageObject;

public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='passp-field-login']")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@id='passp-field-passwd']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement loginBtn;

    @Step("Input in login field value: ({login})")
    public void inputLogin(String login) {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilVisible(loginInput);
        loginInput.sendKeys(login);
    }

    @Step("Input in password field value: ({password})")
    public void inputPassword(String password) {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilClickable(passwordInput);
        passwordInput.sendKeys(password);
    }

    @Step("Click on Login button")
    public void clickLoginBtn() {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilVisible(loginBtn);
        loginBtn.click();
    }

    @Step("Login")
    public void login(String login, String password) {
        inputLogin(login);
        clickLoginBtn();
        inputPassword(password);
        clickLoginBtn();
    }

    @Step("Get Login button")
    public WebElement getLoginBtn()
    {
        return loginBtn;
    }
}
