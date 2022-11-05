package warmup_2;

public class StringTimes {

  public static void main(String[] args) {
    System.out.println(stringTimes("Hi", 2));
    System.out.println(stringTimes("Hi", 3));
    System.out.println(stringTimes("Hi", 1));

    System.out.println(deprecatedStringTimes("Hi", 2));
    System.out.println(deprecatedStringTimes("Hi", 3));
    System.out.println(deprecatedStringTimes("Hi", 1));
  }

  /**
   * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
   * <p>
   * stringTimes("Hi", 2) → "HiHi"
   * stringTimes("Hi", 3) → "HiHiHi"
   * stringTimes("Hi", 1) → "Hi"
   */
  public static String stringTimes(String str, int n) {
    StringBuilder result = new StringBuilder();

    int count = 0;
    while (count < n) {
      result.append(str);
      count++;
    }

    return result.toString();
  }

  public static String deprecatedStringTimes(String str, int n) {
    String result = "";

    int count = 0;
    while (count < n) {
      result = result + str;
      count++;
    }

    return result;
  }
}