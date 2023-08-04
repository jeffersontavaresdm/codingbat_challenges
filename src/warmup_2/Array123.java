package warmup_2;

/**
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 * <p>
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123 {

  public static void main(String[] args) {
    System.out.println(array123(new int[] {1, 1, 2, 3, 1}));
    System.out.println(array123(new int[] {1, 1, 2, 4, 1}));
    System.out.println(array123(new int[] {1, 2, 1, 2, 3}));
  }

  public static boolean array123(int[] nums) {
    if (nums.length < 3) return false;

    boolean isExists = false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        if (nums.length > i + 1 && nums[i + 1] == 2) {
          if (nums.length > i + 2 && nums[i + 2] == 3) {
            isExists = true;
            break;
          }
        }
      }
    }

    return isExists;
  }
}