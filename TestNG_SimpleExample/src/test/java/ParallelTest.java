import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest {
//    @Test(threadPoolSize = 5, invocationCount = 10)
//    public void testCase1() {
//    }

    private WebDriver driver;

    @Test
    public void Test1(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver.navigate().to("https://testng.org/doc/");
    }

    @Test
    public void Test2(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver.navigate().to("https://testng.org/doc/");
    }
}
