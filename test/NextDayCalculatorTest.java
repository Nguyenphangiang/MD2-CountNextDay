import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testDay1Month1Year2018(){
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "2/1/2018";

        String result =  NextDayCalculator.getNextDay(day,month,year);

        assertEquals(expected,result);
    }@Test
    void testDay31Month1Year2018(){
        int firstDayOfYear = 31;
        int firstMonthOfYear = 1;
        int year = 2018;

        String expected = "1/2/2018";

        String result =  NextDayCalculator.getNextDay(firstDayOfYear,firstMonthOfYear,year);

        assertEquals(expected,result);
    }@Test
    void testDay30Month4Year2018(){
        int firstDayOfYear = 30;
        int firstMonthOfYear = 4;
        int year = 2018;

        String expected = "1/5/2018";

        String result =  NextDayCalculator.getNextDay(firstDayOfYear,firstMonthOfYear,year);

        assertEquals(expected,result);
    }@Test
    void testDay28Month2Year2018(){
        int firstDayOfYear = 28;
        int firstMonthOfYear = 2;
        int year = 2018;

        String expected = "1/3/2018";

        String result =  NextDayCalculator.getNextDay(firstDayOfYear,firstMonthOfYear,year);

        assertEquals(expected,result);
    }@Test
    void testDay29Month2Year2020(){
        int firstDayOfYear = 29;
        int firstMonthOfYear = 2;
        int year = 2020;

        String expected = "1/3/2020";

        String result =  NextDayCalculator.getNextDay(firstDayOfYear,firstMonthOfYear,year);

        assertEquals(expected,result);
    }@Test
    void testDay31Month12Year2018(){
        int firstDayOfYear = 31;
        int firstMonthOfYear = 12;
        int year = 2019;

        String expected = "1/1/2019";

        String result =  NextDayCalculator.getNextDay(firstDayOfYear,firstMonthOfYear,year);

        assertEquals(expected,result);
    }

}