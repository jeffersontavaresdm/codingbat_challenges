package warmup_02.countxx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warmup_2.countxx.solutions.Solution01;

public class CountXXTest {

  @Test
  void solution01Test() {
    Assertions.assertEquals(1, Solution01.countXX("abcxx"));
    Assertions.assertEquals(2, Solution01.countXX("xxx"));
    Assertions.assertEquals(3, Solution01.countXX("xxxx"));
  }
}