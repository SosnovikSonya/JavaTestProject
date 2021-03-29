import org.testng.annotations.Test;

public class GroupTests {

    @Test(groups = "regression")
    public void regressionTest1() {
        System.out.println("This is regression test 1");
    }

    @Test(groups = "regression")
    public void regressionTest2() {
        System.out.println("This is regression test 2");
    }

    @Test(groups = "api")
    public void apiTest1() {
        System.out.println("This is api test 1");
    }

    @Test(groups = "api")
    public void apiTest2() {
        System.out.println("This is api test 2");
    }

    @Test(groups = "api")
    public void apiTest3() {
        System.out.println("This is api test 3");
    }
}
