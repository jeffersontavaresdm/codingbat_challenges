package others.diamonds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a string representing diamonds and other characters, modify and return the string as follows:
 * The `diamondCut` method should extract and return a string that only contains valid diamond pairs ("<>" in sequence).
 * The `diamondCount` method should return the number of valid diamond pairs ("<>") in the given string.
 *
 * <p>
 * diamondCut("**<**<**<**<**<**<**<**<**>>>>>>>>*****") → "<><><><><><><><>"
 * diamondCount("**<**<**<**<**<**<**<**<**>>>>>>>>*****") → 8
 * </p>
 */
public class DiamondCutter {

  public static long diamondCount(String diamonds) {
    int diamondCount = 0;
    int count = 0;
    while (count < diamonds.length()) {
      if (diamonds.charAt(count) == '<' && diamonds.charAt(count + 1) == '>') {
        diamondCount++;
      }

      count = count + 2;
    }

    return diamondCount;
  }

  public static String diamondCut(String uncutDiamonds) {
    return getDiamonds(uncutDiamonds)
        .stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
  }

  private static List<String> getDiamonds(String uncutDiamonds) {
    Character[] diamondCharacters = uncutDiamonds
        .chars()
        .mapToObj(character -> (char) character)
        .toList()
        .stream()
        .filter(character -> character.equals('<') || character.equals('>'))
        .toList()
        .toArray(new Character[0]);

    List<Character> diamondLeftParts = new ArrayList<>();
    List<Character> diamondRightParts = new ArrayList<>();

    for (Character character : diamondCharacters) {
      if (character.equals('<')) diamondLeftParts.add(character);
      if (character.equals('>')) diamondRightParts.add(character);
    }

    int diamondCount = (diamondLeftParts.size() + diamondRightParts.size()) / 2;

    List<String> diamonds = new ArrayList<>();
    for (int i = 0; i < diamondCount; i++) {
      diamonds.add(diamondLeftParts.get(i) + "" + diamondRightParts.get(i));
    }

    return diamonds;
  }
}