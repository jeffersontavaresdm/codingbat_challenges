package warmup_2.countxx.solutions;

public class Solution01 {

  public static int countXX(String str) {
    char[] strChars = new char[str.length() + 1];

    for (int i = 0; i < str.length(); i++) {
      strChars[i] = str.charAt(i);
    }

    int result = 0;
    int count = 0;
    while (count < strChars.length) {
      if (strChars[count] == 'x' && strChars[count + 1] == 'x') {
        result++;
      }

      count++;
    }

    return result;
  }
}
