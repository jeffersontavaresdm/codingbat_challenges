package strings_1;

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 * <p>
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */
public class FirstHalf {

  public static void main(String[] args) {
    System.out.println(firstHalf("woohoo"));
    System.out.println(firstHalf("hellothere"));
    System.out.println(firstHalf("abcdef"));
    System.out.println(firstHalf("yzz"));
    System.out.println(firstHalf("y"));
    System.out.println(firstHalf(""));
  }

  public static String firstHalf(String str) {
    if (str.length() % 2 != 0) {
      return str;
    }

    int half = str.length() / 2;

    return str.substring(0, half);
  }
}
