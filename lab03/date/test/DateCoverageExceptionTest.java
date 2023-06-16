import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateCoverageExceptionTest
{

  private int year;
  private int month;
  private int day;

  public DateCoverageExceptionTest(int year, int month, int day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Parameters
  public static List<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );
    params.add(new Integer[] { 1500, 03, 40 });
    params.add(new Integer[] { 1500, 04, 31 });
    params.add(new Integer[] { 400, 02, 30 });
    params.add(new Integer[] { 1458, -1, 12 });
    params.add(new Integer[] { 1975, 6, -50 });
    return params;
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNextDate()
  {
    new Date(year, month, day);
  }
}