package pages;

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

    public void inputLogin(String login) {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilVisible(loginInput);
        loginInput.sendKeys(login);
    }

    public void inputPassword(String password) {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilClickable(passwordInput);
        passwordInput.sendKeys(password);
    }

    public void clickLoginBtn() {
        CustomWaiters customWaiters = new CustomWaiters();
        customWaiters.waitUntilVisible(loginBtn);
        loginBtn.click();
    }

    public void login(String login, String password) {
        inputLogin(login);
        clickLoginBtn();
        inputPassword(password);
        clickLoginBtn();
    }

    public WebElement getLoginBtn()
    {
        return loginBtn;
    }
}
