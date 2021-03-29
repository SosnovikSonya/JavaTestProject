import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelExecutionTest {

    private WebDriver driver;

    @Test
    void Test1(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver.navigate().to("https://junit.org/junit5/");
    }

    @Test
    void Test2(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver.navigate().to("https://junit.org/junit5/");
    }

    @Test
    void Test3(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver.navigate().to("https://junit.org/junit5/");
    }
}
