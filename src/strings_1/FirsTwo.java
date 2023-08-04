package strings_1;

/**
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is
 * shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty
 * string "". Note that str.length() returns the length of a string.
 * <p>
 * firstTwo("Hello") → "He"
 * firstTwo("abcdefg") → "ab"
 * firstTwo("ab") → "ab"
 */
public class FirsTwo {

  public static void main(String[] args) {
    System.out.println(firstTwo("hello"));
    System.out.println(firstTwo("abcde"));
    System.out.println(firstTwo("ab"));
    System.out.println(firstTwo("a"));
    System.out.println(firstTwo(""));
  }

  public static String firstTwo(String str) {
    if (str.length() < 2) return str;

    return str.substring(0, 2);
  }
}
