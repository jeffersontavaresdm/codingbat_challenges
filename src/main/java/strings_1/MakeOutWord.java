package strings_1;

/**
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of
 * the out string, e.g. "<<word>>".
 * <p>
 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
 * <p>
 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 * makeOutWord("[[]]", "word") → "[[word]]"
 */
public class MakeOutWord {

  public static void main(String[] args) {
    System.out.println(makeOutWord("<<>>", "test"));
    System.out.println(makeOutWord("[[]]", "test"));
    System.out.println(makeOutWord("", "test"));
    System.out.println(makeOutWord("HHoo", "Hello"));
    System.out.println(makeOutWord("abyz", "YAY"));
  }

  public static String makeOutWord(String out, String word) {
    if (out.length() < 4) {
      return word;
    }

    String prefix = out.substring(0, 2);
    String suffix = out.substring(2, 4);

    return prefix + word + suffix;
  }
}
