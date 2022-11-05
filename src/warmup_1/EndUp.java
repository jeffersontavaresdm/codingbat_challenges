package warmup_1;

public class EndUp {

  /**
   * Given a string, return a new string where the last 3 chars are now in upper case.
   * If the string has less than 3 chars, uppercase whatever is there.
   * Note that str.toUpperCase() returns the uppercase version of a string.
   * <p>
   * endUp("Hello") → "HeLLO"
   * endUp("hi there") → "hi thERE"
   * endUp("hi") → "HI"
   */
  public static void main(String[] args) {
    System.out.println(endUp("Hello"));
    System.out.println(endUp("hi there"));
    System.out.println(endUp("hi"));
  }

  public static String endUp(String str) {
    if (str.length() < 4) return str.toUpperCase();

    String begin = str.substring(0, str.length() - 3);
    String end = str.substring(str.length() - 3).toUpperCase();

    return begin + end;
  }
}