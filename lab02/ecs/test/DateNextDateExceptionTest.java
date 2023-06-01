import static org.junit.Assert.assertThrows;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test case class for Exception test cases
 */
@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {
    private int day, month, year;

    public DateNextDateExceptionTest(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Function creating test case parameters
     * @return List of Integer arrays containing the year, month and date to create a Date object during test case execution
     */
    @Parameters
    public static List<Integer[]> dates() {
        List<Integer[]> dates = new LinkedList<Integer[]>();
        
        // 16
        dates.add(new Integer[] {1500, 2, 31});

        // 17
        dates.add(new Integer[] {1500, 2, 29});

        // 18
        dates.add(new Integer[] {-1, 10, 20});

        // 19
        dates.add(new Integer[] {1458, 15, 12});

        // 20
        dates.add(new Integer[] {1975, 6, -50});
        return dates;
    }

    /**
     * Test case execution (16-20)
     * asserts that test cases throw and IllegalArguentException
     */
    @Test
    public void testDateNextDateException() {
        assertThrows(IllegalArgumentException.class, () -> new Date(year, month, day));
    }
}