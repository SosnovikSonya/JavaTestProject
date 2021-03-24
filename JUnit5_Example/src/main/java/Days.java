import java.util.stream.Stream;

public class Days {

    static Stream<String> getDaysOfWeek() {
        return Stream.of(DayOfWeek.MONDAY.toString(), DayOfWeek.TUESDAY.toString(), DayOfWeek.WEDNESDAY.toString());
    }
}
