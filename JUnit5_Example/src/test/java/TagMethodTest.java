import customAnnotation.PerformanceApiTag;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagMethodTest {

    @Tag("api")
    @Test
    void api_test1() {
        System.out.println("api_test1()");
    }

    @Tag("api")
    @Test
    void api_test2() {
        System.out.println("api_test2()");
    }

    @Tag("load")
    @Test
    void load_test1() {
        System.out.println("load_test1()");
    }

    @Tag("performance")
    @Test
    void performance_test1() {
        System.out.println("performance_test1()");
    }

    @PerformanceApiTag
    @Test
    void performance_api_test1() {
        System.out.println("performance_api_test1()");
    }

    @PerformanceApiTag
    @Test
    void performance_api_test2() {
        System.out.println("performance_api_test2()");
    }
}