package logic_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CigarPartyTest {

  @Test
  public void givenWeekdayAndLessThan40Cigars_whenCheckingParty_shouldReturnFalse() {
    int cigars = 30;
    boolean isWeekend = false;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertFalse(result);
  }

  @Test
  public void givenWeekdayAndBetween40And60Cigars_whenCheckingParty_shouldReturnTrue() {
    int cigars = 50;
    boolean isWeekend = false;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertTrue(result);
  }

  @Test
  public void givenWeekendAndMoreThan60Cigars_whenCheckingParty_shouldReturnTrue() {
    int cigars = 70;
    boolean isWeekend = true;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertTrue(result);
  }

  @Test
  public void givenWeekendAndLessThan40Cigars_whenCheckingParty_shouldReturnFalse() {
    int cigars = 30;
    boolean isWeekend = true;

    boolean result = CigarParty.cigarParty(cigars, isWeekend);

    Assertions.assertFalse(result);
  }
}