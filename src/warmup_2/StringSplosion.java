package warmup_2;

public class StringSplosion {

  public static void main(String[] args) {
    System.out.println(stringSplosion("Code"));
    System.out.println(stringSplosion("abc"));
    System.out.println(stringSplosion("ab"));
  }

  /**
   * Given a non-empty string like "Code" return a string like "CCoCodCode".
   * <p>
   * <p>
   * stringSplosion("Code") → "CCoCodCode"
   * stringSplosion("abc") → "aababc"
   * stringSplosion("ab") → "aab"
   */
  public static String stringSplosion(String str) {
    StringBuilder result = new StringBuilder();

    int count = 0;
    while (count < str.length()) {
      result.append(str, 0, count + 1);
      count++;
    }

    return result.toString();
  }
}
