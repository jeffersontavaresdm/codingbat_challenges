package warmup_1;

import java.util.Objects;

public class NotString {

  /**
   * Given a string, return a new string where "not " has been added to the front.
   * However, if the string already begins with "not", return the string unchanged.
   * Note: use .equals() to compare 2 strings.
   * <p>
   * notString("candy") → "not candy"
   * notString("x") → "not x"
   * notString("not bad") → "not bad"
   */
  public static void main(String[] args) {
    System.out.println(notString("not X"));
    System.out.println(notString("X"));
    System.out.println(notString("is not"));
  }

  public static String notString(String str) {
    if (Objects.equals(str, "not")) return str;
    else if (str.length() >= 3 && str.substring(0, 3).contains("not")) return str;
    else return "not " + str;
  }
}