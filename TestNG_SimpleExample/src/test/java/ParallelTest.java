import org.testng.annotations.Test;

public class ParallelTest {
    @Test(threadPoolSize = 5, invocationCount = 10)
    public void testCase1() {
    }
}
