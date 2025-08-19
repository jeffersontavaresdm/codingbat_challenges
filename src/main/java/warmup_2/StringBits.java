package warmup_2;

public class StringBits {

  public static void main(String[] args) {
    System.out.println(stringBits("Hello"));
    System.out.println(stringBits("Hi"));
    System.out.println(stringBits("Heeololeo"));
  }

  /**
   * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
   * <p>
   * stringBits("Hello") → "Hlo"
   * stringBits("Hi") → "H"
   * stringBits("Heeololeo") → "Hello"
   */
  public static String stringBits(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i = i + 2) {
      result.append(str.charAt(i));
    }

    return result.toString();
  }
}
