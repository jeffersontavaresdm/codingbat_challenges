package warmup_01.sleepIn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warmup_1.sleepIn.solutions.Solution01;

public class SleepInTest {

  @Test
  void solution01Test() {
    Assertions.assertTrue(Solution01.sleepIn(false, false));
    Assertions.assertFalse(Solution01.sleepIn(true, false));
    Assertions.assertTrue(Solution01.sleepIn(false, true));
  }
}