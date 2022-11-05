package warmup_1;

public class Max1020 {

  /**
   * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive.
   * Or return 0 if neither is in that range.
   * <p>
   * max1020(11, 19) → 19
   * max1020(19, 11) → 19
   * max1020(11, 9) → 11
   */
  public static void main(String[] args) {
    System.out.println(max1020(11, 19));
    System.out.println(max1020(19, 11));
    System.out.println(max1020(11, 9));
  }

  public static int max1020(int a, int b) {
    if (a >= 10 && a <= 20) {
      if (b >= 10 && b <= 20) {
        return Math.max(a, b);
      } else return a;
    } else if (b >= 10 && b <= 20) return b;

    return 0;
  }
}