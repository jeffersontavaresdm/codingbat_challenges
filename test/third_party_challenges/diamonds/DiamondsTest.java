package third_party_challenges.diamonds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import third_party_challenges.diamonds.solutions.Solution01;

public class DiamondsTest {

  @Test
  public void solution01Test() {
    String diamonds01 = Solution01.diamondCut("**<**<**<**<**<**<**<**<**>>>>>>>>*****");
    String diamonds02 = Solution01.diamondCut("<<<*<<**<<<<>*****>>**>>**>>>********>>");
    String diamonds03 = Solution01.diamondCut("<*<*<*<*<*<*<*<*<*<*>*>*>*>*>*>*>*>*>*>");

    Assertions.assertEquals("<><><><><><><><>", diamonds01);
    Assertions.assertEquals("<><><><><><><><><>", diamonds02);
    Assertions.assertEquals("<><><><><><><><><><>", diamonds03);

    Assertions.assertEquals(8, Solution01.diamondCount(diamonds01));
    Assertions.assertEquals(9, Solution01.diamondCount(diamonds02));
    Assertions.assertEquals(10, Solution01.diamondCount(diamonds03));
  }
}
