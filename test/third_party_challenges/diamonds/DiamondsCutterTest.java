package third_party_challenges.diamonds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import third_party_challenges.diamonds.solutions.DiamondCutter;

public class DiamondsCutterTest {

  @Test
  public void shouldReturnExpectedDiamondCutForFirstInput() {
    String uncutDiamonds = "**<**<**<**<**<**<**<**<**>>>>>>>>*****";

    String result = DiamondCutter.diamondCut(uncutDiamonds);

    Assertions.assertEquals("<><><><><><><><>", result);
  }

  @Test
  public void shouldReturnExpectedDiamondCutForSecondInput() {
    String uncutDiamonds = "<<<*<<**<<<<>*****>>**>>**>>>********>>";

    String result = DiamondCutter.diamondCut(uncutDiamonds);

    Assertions.assertEquals("<><><><><><><><><>", result);
  }

  @Test
  public void shouldReturnExpectedDiamondCutForThirdInput() {
    String uncutDiamonds = "<*<*<*<*<*<*<*<*<*<*>*>*>*>*>*>*>*>*>*>";

    String result = DiamondCutter.diamondCut(uncutDiamonds);

    Assertions.assertEquals("<><><><><><><><><><>", result);
  }

  @Test
  public void shouldReturnCorrectDiamondCountForFirstInput() {
    String uncutDiamonds = "**<**<**<**<**<**<**<**<**>>>>>>>>*****";

    String result = DiamondCutter.diamondCut(uncutDiamonds);
    Long count = DiamondCutter.diamondCount(result);

    Assertions.assertEquals(8, count);
  }

  @Test
  public void shouldReturnCorrectDiamondCountForSecondInput() {
    String uncutDiamonds = "<<<*<<**<<<<>*****>>**>>**>>>********>>";

    String result = DiamondCutter.diamondCut(uncutDiamonds);
    Long count = DiamondCutter.diamondCount(result);

    Assertions.assertEquals(9, count);
  }

  @Test
  public void shouldReturnCorrectDiamondCountForThirdInput() {
    String uncutDiamonds = "<*<*<*<*<*<*<*<*<*<*>*>*>*>*>*>*>*>*>*>";

    String result = DiamondCutter.diamondCut(uncutDiamonds);
    Long count = DiamondCutter.diamondCount(result);

    Assertions.assertEquals(10, count);
  }
}
