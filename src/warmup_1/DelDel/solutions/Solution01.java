package warmup_1.DelDel.solutions;

public class Solution01 {

  public static String delDel(String str) {
    if (str.length() >= 4 && str.startsWith("del", 1)) {
      return str.charAt(0) + str.substring(4);
    } else return str;
  }
}