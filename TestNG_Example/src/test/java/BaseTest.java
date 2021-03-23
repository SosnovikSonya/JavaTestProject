import driverManager.InitialDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProfilePage;
import utils.TestData;

abstract class BaseTest extends TestData {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;

    @BeforeMethod
    public void BaseTestSetUp() {
        driver = InitialDriver.getInstance().getDriver();
        driver.navigate().to(yandexLoginUrl);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void BaseTestTearDown() {
        InitialDriver.getInstance().destroy();
    }
}