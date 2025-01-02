package third_party_challenges.diamonds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import third_party_challenges.diamonds.solutions.Solution01;

public class DiamondsTest {

  @Test
  public void shouldReturnExpectedDiamondCutForFirstInput() {
    String diamonds01 = Solution01.diamondCut("**<**<**<**<**<**<**<**<**>>>>>>>>*****");
    Assertions.assertEquals("<><><><><><><><>", diamonds01);
  }

  @Test
  public void shouldReturnExpectedDiamondCutForSecondInput() {
    String diamonds02 = Solution01.diamondCut("<<<*<<**<<<<>*****>>**>>**>>>********>>");
    Assertions.assertEquals("<><><><><><><><><>", diamonds02);
  }

  @Test
  public void shouldReturnExpectedDiamondCutForThirdInput() {
    String diamonds03 = Solution01.diamondCut("<*<*<*<*<*<*<*<*<*<*>*>*>*>*>*>*>*>*>*>");
    Assertions.assertEquals("<><><><><><><><><><>", diamonds03);
  }

  @Test
  public void shouldReturnCorrectDiamondCountForFirstInput() {
    String diamonds01 = Solution01.diamondCut("**<**<**<**<**<**<**<**<**>>>>>>>>*****");
    Long count = Solution01.diamondCount(diamonds01);
    Assertions.assertEquals(8, count);
  }

  @Test
  public void shouldReturnCorrectDiamondCountForSecondInput() {
    String diamonds02 = Solution01.diamondCut("<<<*<<**<<<<>*****>>**>>**>>>********>>");
    Long count = Solution01.diamondCount(diamonds02);
    Assertions.assertEquals(9, count);
  }

  @Test
  public void shouldReturnCorrectDiamondCountForThirdInput() {
    String diamonds03 = Solution01.diamondCut("<*<*<*<*<*<*<*<*<*<*>*>*>*>*>*>*>*>*>*>");
    Long count = Solution01.diamondCount(diamonds03);
    Assertions.assertEquals(10, count);
  }
}
