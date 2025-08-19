package warmup_1;

public class IntMax {

  /**
   * Given three int values, a b c, return the largest.
   * <p>
   * intMax(1, 2, 3) → 3
   * intMax(1, 3, 2) → 3
   * intMax(3, 2, 1) → 3
   */
  public static void main(String[] args) {
    System.out.println(intMax(1, 2, 3));
    System.out.println(intMax(1, 3, 2));
    System.out.println(intMax(3, 2, 1));
  }

  public static int intMax(int a, int b, int c) {
    int[] list = {a, b, c};
    int largest = Integer.MIN_VALUE;

    int count = 0;
    while (count < list.length) {
      if (largest <= list[count]) largest = list[count];
      count++;
    }

    return largest;
  }
}