import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @Test
    @Parameters({"number", "day"})
    public void testCase1(int number, String day) {
        System.out.println(day + " is " + number + " day of week");
    }

//    @DataProvider(name = "days")
//    public static Object[][] daysOgWeek() {
//        return new Object[][]{{1, "Monday"}, {2, "Tuesday"}, {3, "Wednesday"}};
//    }
//
//    @Test(dataProvider = "days")
//    public void testCase2(Integer number, String day) {
//        System.out.println(day + " is " + number + " day of week");
//    }
}
