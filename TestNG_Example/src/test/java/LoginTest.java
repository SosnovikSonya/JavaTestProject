import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void yandexLogin_ValidCredentials() {
        loginPage.login(validLogin, validPassword);
        Assert.assertEquals(validLogin, profilePage.getUserName(), "User name is not equal to login");
    }

    @Test
    public void yandexLogout() {
        loginPage.login(validLogin, validPassword);
        String loginUrl = driver.getCurrentUrl();
        profilePage.userLogout();
        String logoutUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(loginUrl, logoutUrl, "Url after logout is equal to url before");
        Assert.assertTrue(loginPage.getLoginBtn().isDisplayed(), "Login button is not displayed");
    }
}

