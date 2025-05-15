package logic_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CigarPartyTest {

  @Test
  public void shoudlReturnFalseWhenCigarsLessThan40() {
    int cigars = 30;
    boolean isWeekend = false;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertFalse(result);
  }

  @Test
  public void shoudlReturnTrueWhenCigarsBetween40And60() {
    int cigars = 50;
    boolean isWeekend = false;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertTrue(result);
  }

  @Test
  public void shoudlReturnTrueWhenCigarsGreaterThan60ButIsWeekend() {
    int cigars = 70;
    boolean isWeekend = true;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertTrue(result);
  }

  @Test
  public void shoudlReturnFalseIfIsWeekendButCigarsLessThan40() {
    int cigars = 30;
    boolean isWeekend = true;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertFalse(result);
  }
}