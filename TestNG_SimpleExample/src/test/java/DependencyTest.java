import org.testng.annotations.Test;

public class DependencyTest {

    @Test //(enabled = false)
    public void testCase1() {
        System.out.println("This is the Test Case 1");
    }

    @Test(dependsOnMethods = { "testCase1" })
    public void testCase2() {
        System.out.println("This is the Test Case 2");
    }

    @Test(groups = "api")
    public void apiTest1() {
        System.out.println("This is api test 1");
    }

    @Test(groups = "api")
    public void apiTest2() {
        System.out.println("This is api test 2");
    }

    @Test(dependsOnGroups = { "api" })
    public void testCase3() {
        System.out.println("This is the Test Case 3");
    }
}
