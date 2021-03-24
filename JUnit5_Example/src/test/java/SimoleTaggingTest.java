import customAnnotation.Fast;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimoleTaggingTest {

    @Test
    @Tag("fast")
    void testMethod1() {
    }

    @Test
    @Fast
    void testMethod2() {
    }

    @Test
    void testMethod3() {
    }
}
