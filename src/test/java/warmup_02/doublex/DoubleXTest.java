package warmup_02.doublex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warmup_2.doublex.solutions.Solution01;

public class DoubleXTest {

  @Test
  void solution01Test() {
    Assertions.assertTrue(Solution01.doubleX("axxbb"));
    Assertions.assertFalse(Solution01.doubleX("axaxax"));
    Assertions.assertTrue(Solution01.doubleX("xxxxx"));
  }
}