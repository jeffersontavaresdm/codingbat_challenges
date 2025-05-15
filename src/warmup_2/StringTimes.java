package warmup_2;

public class StringTimes {

  /**
   * Dada uma string e um inteiro não-negativo n, retorna uma string maior
   * contendo n cópias da string original.
   * <p>
   * stringTimes("Hi", 2) → "HiHi"
   * stringTimes("Hi", 3) → "HiHiHi"
   * stringTimes("Hi", 1) → "Hi"
   */
  public static String stringTimes(String str, int n) {
    StringBuilder result = new StringBuilder();

    int count = 0;
    while (count < n) {
      result.append(str);
      count++;
    }

    return result.toString();
  }

  public static String deprecatedStringTimes(String str, int n) {
    String result = "";

    int count = 0;
    while (count < n) {
      result = result + str;
      count++;
    }

    return result;
  }
}
