import io.qameta.allure.junit4.DisplayName;
import org.junit.*;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Test method to check login with valid credentials")
    public void yandexLogin_ValidCredentials() {
        loginPage.login(validLogin, validPassword);
        Assert.assertEquals("User name is not equal to login", validLogin, profilePage.getUserName());
    }

    @Test
    @DisplayName("Test method to check logout")
    public void yandexLogout() {
        loginPage.login(validLogin, validPassword);
        String loginUrl = driver.getCurrentUrl();
        profilePage.userLogout();
        String logoutUrl = driver.getCurrentUrl();
        Assert.assertNotEquals("Url after logout is equal to url before", loginUrl, logoutUrl);
        Assert.assertTrue("Login button is not displayed", loginPage.getLoginBtn().isDisplayed());
    }
}

