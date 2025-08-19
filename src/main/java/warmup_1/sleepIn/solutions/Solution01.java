package warmup_1.sleepIn.solutions;

public class Solution01 {

  public static boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }
}
