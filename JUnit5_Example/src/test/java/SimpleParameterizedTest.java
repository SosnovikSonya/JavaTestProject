import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

public class SimpleParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void simpleTest(int argument) {
        System.out.println(argument);
    }

    @ParameterizedTest
    @NullSource
    void nullSourceTest(String value) {
        assertTrue(value == null);
    }

    @ParameterizedTest
    @EmptySource
    void emptySourceTest(String value) {
        assertTrue(value.isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void nullAndEmptySourceTest(String value) {
        assertTrue(value == null || value.isEmpty());
    }

    //@EnumSource provides a convenient way to use Enum constants
    @ParameterizedTest
    @EnumSource(DayOfWeek.class)
    void enumSourceTest(DayOfWeek day) {
        System.out.println(day);
    }

    @ParameterizedTest
    @EnumSource(names = { "SATURDAY", "SUNDAY" })
    void enumSourceTestInclude(DayOfWeek day) {
        System.out.println(day);
    }

    @ParameterizedTest
    @EnumSource(mode = EXCLUDE, names = { "SATURDAY", "SUNDAY" })
    void enumSourceTestExclude(DayOfWeek day) {
        System.out.println(day);
    }

    //@MethodSource allows you to refer to one or more factory methods of the test class or external classes.
    @ParameterizedTest
    @MethodSource("Days#getDaysOfWeek")
    void externalMethodSourceTest(String day) {
        System.out.println(day);
    }

    @DisplayName("Display name of Parameterized Test")
    @ParameterizedTest(name = "{index} ==> {0} is {1} day of week")
    @CsvSource({ "Monday, 1", "Tuesday, 2", "Wednesday, 3" })
    void csvSourceWithCustomDisplayNames(String day, int number) {
    }
}
