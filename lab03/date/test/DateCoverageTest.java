import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateCoverageTest {

  @Test
  void dateNotEqualsInteger() {
    Date today = new Date(1700, 6, 20);
    Integer n = 1;
    assert(!today.equals(n));
  }

  @Test
  void dateToString() {
    Date today = new Date(2005, 4, 15);
    assertEquals(today.toString(),"2005/April/15");
  }
}