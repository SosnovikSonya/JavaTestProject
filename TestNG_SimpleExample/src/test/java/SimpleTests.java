import org.testng.annotations.*;

public class SimpleTests {
    @Test
    public void testCase1() {
        System.out.println("This is the Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("This is the Test Case 2");
    }

    @Test(enabled = false)
    public void testIgnored() {
        System.out.println("This test is ignored");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionTest() {
        String str = null;
        str.length();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after Test Suite");
    }

}
