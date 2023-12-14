package L09_Testing.DateClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTestSimple {
    @Test
    public void testAddRandomDay(){
        Date d = new Date(2050, 2, 15);
        d.addDays(4);
        assertEquals(2050, d.getYear()); // expected
        assertEquals(2, d.getMonth()); // value should
        assertEquals(19, d.getDay()); // be at LEFT
    }

    @Test
    public void testAddDaysWithSameMonth() {
        Date actual = new Date(2050, 2, 15);
        actual.addDays(4);
        Date expected = new Date(2050, 2, 19);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testAddDaysWrapToNextMonth() {
        Date actual = new Date( 2050, 2, 15);
        actual.addDays(14);
        Date expected = new Date(2050, 3, 1);
        assertEquals(expected.toString(),actual.toString());
    }

}