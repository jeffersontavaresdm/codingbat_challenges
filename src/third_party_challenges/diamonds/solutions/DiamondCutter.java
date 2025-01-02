package third_party_challenges.diamonds.solutions;

import java.util.ArrayList;
import java.util.List;

public class DiamondCutter {

  public static long diamondCount(String diamonds) {
    String[] separateDiamonds = new String[diamonds.length() / 2];

    int diamondCount = 0;
    int count = 0;
    while (count < diamonds.length()) {
      if (diamonds.charAt(count) == '<' && diamonds.charAt(count + 1) == '>') {
        separateDiamonds[diamondCount] = diamonds.charAt(count) + "" + diamonds.charAt(count + 1);
        diamondCount++;
      }

      count = count + 2;
    }

    long result = 0;
    for (String diamond : separateDiamonds) {
      if (diamond.charAt(0) == '<' && diamond.charAt(1) == '>') {
        result++;
      }
    }

    return result;
  }

  public static String diamondCut(String string) {
    List<Character> charList = new ArrayList<>();

    for (int i = 0; i < string.length(); i++) {
      char character = string.charAt(i);

      if (character == '<' || character == '>') charList.add(character);
    }

    List<Character> characterListLeft = new ArrayList<>();
    List<Character> characterListRight = new ArrayList<>();

    for (Character character : charList) {
      if (character.equals('<')) characterListLeft.add(character);
      else if (character.equals('>')) characterListRight.add(character);
    }

    List<Character> diamonds = new ArrayList<>();
    int diamondCount = (characterListLeft.size() + characterListRight.size()) / 2;

    for (int i = 0; i < diamondCount; i++) {
      diamonds.add(characterListLeft.get(i));
      diamonds.add(characterListRight.get(i));
    }

    return diamonds
      .toString()
      .replaceAll(",", "")
      .replaceAll(" ", "")
      .replaceAll("\\[", "")
      .replaceAll("]", "");
  }
}