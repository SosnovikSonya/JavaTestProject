import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTest {
    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @Order(3)
    @Test
    @DisplayName("Simple successful test")
    void simpleSuccessTest() {
        System.out.println("Success");
    }

    @Order(1)
    @DisplayName("Repeated Test")
    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    void simpleRepeatedTest(RepetitionInfo repetitionInfo) {
        assertEquals(3, repetitionInfo.getTotalRepetitions());
        System.out.println("Repeat...");
    }

    @Order(4)
    @Test
    @DisplayName("Disabled test")
    @Disabled("Not implemented yet")
    void disabledTest() {
    }

    @Test
    @Order(2)
    @Timeout(5)
    void timeoutTest() throws InterruptedException {
        Thread.sleep(6000);
        //Assertions.assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(10000));
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - executed after all test methods.");
    }
}
