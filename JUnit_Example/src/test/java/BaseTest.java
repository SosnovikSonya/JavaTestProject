import driverManager.InitialDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProfilePage;
import utils.TestData;

abstract class BaseTest extends TestData {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;

    @Before
    public void BaseTestSetUp() {
        driver = InitialDriver.getInstance().getDriver();
        driver.navigate().to(yandexLoginUrl);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
    }

    @After
    public void BaseTestTearDown() {
        InitialDriver.getInstance().destroy();
    }
}