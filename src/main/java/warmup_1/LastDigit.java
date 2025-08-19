package warmup_1;

public class LastDigit {

  /**
   * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
   * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
   * <p>
   * lastDigit(7, 17) → true
   * lastDigit(6, 17) → false
   * lastDigit(3, 113) → true
   */
  public static void main(String[] args) {
    System.out.println(lastDigit(7, 17));
    System.out.println(lastDigit(6, 17));
    System.out.println(lastDigit(3, 113));
  }

  public static boolean lastDigit(int x, int y) {
    char[] xValues = String.valueOf(x).toCharArray();
    char[] yValues = String.valueOf(y).toCharArray();

    int lastYValue = Integer.parseInt(yValues[yValues.length - 1] + "");
    int lastXValue = Integer.parseInt(xValues[xValues.length - 1] + "");

    return lastXValue == lastYValue;
  }
}