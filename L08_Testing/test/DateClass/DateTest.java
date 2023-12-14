package L09_Testing.DateClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class DateTest {
    @Test
    public void testAddDays( ) {
        Date date = new Date( 2022, 12, 31 );
        date.addDays( 1 );
        Assertions.assertEquals( "2023/01/01", date.toString( ) );
    }

    @Test
    public void testAddWeeks( ) {
        Date date = new Date( 2022, 12, 31 );
        date.addWeeks( 1 );
        Assertions.assertEquals( "2023/01/07", date.toString( ) );
    }

    @Test
    public void testDaysTo( ) {
        Date date1 = new Date( 2022, 12, 31 );
        Date date2 = new Date( 2023, 1, 5 );
        Assertions.assertEquals( 5, date1.daysTo( date2 ) );
    }

    @Test
    public void testIsLeapYear( ) {
        Date date = new Date( 2020, 1, 1 );
        Assertions.assertTrue( date.isLeapYear( ) );
    }

    // test every day of the year
    @Test
    @Timeout( 5 )
    public void tortureTest( ) throws InterruptedException {
        Date date = new Date( 2050, 1, 1 );
        int month = 1;
        int day = 1;
        for ( int i = 1; i < 365; i++ ) {
            date.addDays( 1 );
            if ( day < DAYS_PER_MONTH[ month ] ) {
                day++;
            } else {
                month++;
                day = 1;
            }
            Date expected = new Date( 2050, month, day );
            Assertions.assertEquals( expected.toString() , date.toString() );
        }
        TimeUnit.SECONDS.sleep(5);
    }

    private static final int[] DAYS_PER_MONTH = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    }; // Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec

}