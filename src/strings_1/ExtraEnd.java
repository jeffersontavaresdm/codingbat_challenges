package strings_1;

/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length
 * will be at least 2.
 * <p>
 * extraEnd("Hello") → "lololo"
 * extraEnd("ab") → "ababab"
 * extraEnd("Hi") → "HiHiHi"
 */
public class ExtraEnd {

  public static void main(String[] args) {
    System.out.println(extraEnd("test"));
    System.out.println(extraEnd("hello"));
    System.out.println(extraEnd("ab"));
    System.out.println(extraEnd("hi"));
    System.out.println(extraEnd("Z"));
    System.out.println(extraEnd(""));
  }

  public static String extraEnd(String str) {
    int length = str.length();

    if (length == 0) {
      return str;
    } else if (length == 1) {
      return str.repeat(6);
    }

    String last2Chars = str.substring(str.length() - 2);

    return last2Chars.repeat(3);
  }

  public static String extraEnd_Java8(String str) {
    String result = str;

    if (str.isEmpty()) {
      return str;
    } else if (str.length() == 1) {
      for (int i = 0; i < 6; i++) {
        result = result + str;
      }

      return result;
    }

    result = str.substring(str.length() - 2);
    for (int i = 0; i < 6; i++) {
      result = result + result;
    }

    return result;
  }
}
