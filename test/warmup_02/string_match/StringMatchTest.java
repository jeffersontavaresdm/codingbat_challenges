package warmup_02.string_match;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warmup_2.stringMatch.StringMatch;

import java.util.HashMap;
import java.util.Map;

class StringMatchTest {

  @Test
  public void shouldReturnZeroIfNotMatchesSubstring() {
    Map<Integer, String> strings = new HashMap<>();
    strings.put(1, "abc");
    strings.put(2, "axc");

    int result = StringMatch.stringMatch(strings.get(1), strings.get(2));

    Assertions.assertEquals(0, result);
  }

  @Test
  public void shouldReturnTwoWhenTwoCharsMatches() {
    Map<Integer, String> strings = new HashMap<>();
    strings.put(1, "abc");
    strings.put(2, "abc");

    int result = StringMatch.stringMatch(strings.get(1), strings.get(2));

    Assertions.assertEquals(2, result);
  }

  @Test
  public void shouldReturnThreeWhenThreeCharsMatches() {
    Map<Integer, String> strings = new HashMap<>();
    strings.put(1, "xxcaazz");
    strings.put(2, "xxbaaz");

    int result = StringMatch.stringMatch(strings.get(1), strings.get(2));

    Assertions.assertEquals(3, result);
  }
}