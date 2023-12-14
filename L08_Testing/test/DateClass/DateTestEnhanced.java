package L09_Testing.DateClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateTestEnhanced {
    private Date date;
    @BeforeEach
    public void setup() {
        date = new Date(2022, 12, 31);
    }

    @DisplayName("Test addDays method")
    @ParameterizedTest(name = "Adding {0} days should result in {1}")
    @CsvSource({
            "1, 2023/01/01",
            "7, 2023/01/07",
            "365, 2023/12/31"
    })
    public void testAddDays(int daysToAdd, String expectedDate) {
        date.addDays(daysToAdd);
        Assertions.assertEquals(expectedDate, date.toString());
    }

    @DisplayName("Test addWeeks method")
    @ParameterizedTest(name = "Adding {0} weeks should result in {1}")
    @CsvSource({
            "1, 2023/01/07",
            "2, 2023/01/14",
            "52, 2023/12/30"
    })
    public void testAddWeeks(int weeksToAdd, String expectedDate) {
        date.addWeeks(weeksToAdd);
        Assertions.assertEquals(expectedDate, date.toString());
    }
    @DisplayName("Test daysTo method")
    @ParameterizedTest(name = "Days between {0} and {1} should be {2}")
    @CsvSource({
            "2022/12/31, 2023/01/05, 5",
            "2023/01/01, 2023/01/01, 0",
            "2023/01/05, 2022/12/31, 0"
    })
    public void testDaysTo(String startDate, String endDate, int expectedDays) {
        Date startDateObj = createDateFromString(startDate);
        Date endDateObj = createDateFromString(endDate);
        int days = startDateObj.daysTo(endDateObj);
        Assertions.assertEquals(expectedDays, days);
    }
    @DisplayName("Test isLeapYear method")
    @ParameterizedTest(name = "Year {0} should be a leap year: {1}")
    @CsvSource({
            "2000, true",
            "2020, true",
            "2022, false",
            "2100, false"
    })
    public void testIsLeapYear(int year, boolean expectedIsLeapYear) {
        Date testDate = new Date(year, 1, 1);
        boolean isLeapYear = testDate.isLeapYear();
        Assertions.assertEquals(expectedIsLeapYear, isLeapYear);
    }
    private Date createDateFromString(String dateString) {
        String[] parts = dateString.split("/");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return new Date(year, month, day);
    }
}