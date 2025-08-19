package warmup_2;

public class FrontTimes {

  public static void main(String[] args) {
    System.out.println(deprecatedFrontTimes("Chocolate", 2));
    System.out.println(deprecatedFrontTimes("Chocolate", 3));
    System.out.println(deprecatedFrontTimes("Abc", 3));
    System.out.println(deprecatedFrontTimes("XY", 3));
    System.out.println(deprecatedFrontTimes("Z", 3));

    System.out.println(frontTimes("Chocolate", 2));
    System.out.println(frontTimes("Chocolate", 3));
    System.out.println(frontTimes("Abc", 3));
    System.out.println(frontTimes("XY", 3));
    System.out.println(frontTimes("Z", 3));
  }

  /**
   * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars.
   * Or whatever is there if the string is less than length 3. Return n copies of the front;
   * <p>
   * deprecatedFrontTimes("Chocolate", 2) → "ChoCho"
   * deprecatedFrontTimes("Chocolate", 3) → "ChoChoCho"
   * deprecatedFrontTimes("Abc", 3) → "AbcAbcAbc"
   */
  public static String deprecatedFrontTimes(String str, int n) {
    String result = "";

    int count = 0;
    while (count < n) {
      if (str.length() < 3) result = result + str.substring(0, str.length());
      else result = result + str.substring(0, 3);

      count++;
    }

    return result;
  }

  public static String frontTimes(String str, int n) {
    StringBuilder result = new StringBuilder();

    int count = 0;
    while (count < n) {
      if (str.length() < 3) result.append(str);
      else result.append(str, 0, 3);

      count++;
    }

    return result.toString();
  }
}
