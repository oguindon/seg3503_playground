import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateCoverageTest
{

  private Date today;
  private Date expectedTomorrow;

  public DateNextDateCoverageTest(
    int todayYear, int todayMonth, int todayDay,
    int expeectedYear, int expectedMonth, int expectedDay)
  {
    this.today = new Date(todayYear, todayMonth, todayDay);
    this.expectedTomorrow = new Date(expeectedYear, expectedMonth, expectedDay);
  }

  @Parameters
  public static List<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );
    params.add(new Integer[] { 1711, 2, 28, 1711, 3, 1 });
    params.add(new Integer[] { 3456, 9, 30, 3456, 10, 1 });
    return params;
  }

  @Test
  public void testNextDate()
  {
    Date actualTomorrow = today.nextDate();
    assert(expectedTomorrow.equals(actualTomorrow));
  }
}