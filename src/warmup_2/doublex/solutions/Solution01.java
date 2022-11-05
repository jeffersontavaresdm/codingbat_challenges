package warmup_2.doublex.solutions;

public class Solution01 {

  public static boolean doubleX(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x') {
        if (i + 1 < str.length()) {
          return str.charAt(i + 1) == 'x';
        }
      }
    }

    return false;
  }
}
