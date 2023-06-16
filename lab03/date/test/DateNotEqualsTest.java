import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNotEqualsTest
{

  private Date day1;
  private Date day2;

  public DateNotEqualsTest(
    int day1Year, int day1Month, int day1Day,
    int day2Year, int day2Month, int day2Day)
  {
    this.day1 = new Date(day1Year, day1Month, day1Day);
    this.day2 = new Date(day2Year, day2Month, day2Day);
  }

  @Parameters
  public static List<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );
    params.add(new Integer[] { 1711, 2, 28, 1712, 2, 28 });
    params.add(new Integer[] { 3456, 9, 30, 3456, 10, 30 });
    params.add(new Integer[] { 3456, 9, 30, 3456, 9, 20 });
    params.add(new Integer[] { 3, 7, 3, 556, 11, 2 });
    return params;
  }

  @Test
  public void testDateEquals()
  {
    assert(!day1.equals(day2));
  }
}