package map_1.mapAB2;

import java.util.Map;
import java.util.Objects;

public class MapAB2 {

  /**
   * Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
   * remove them both.
   * <p>
   * <p>
   * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
   * mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
   * mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
   */
  public static Map<String, String> mapAB2(Map<String, String> map) {
    if (verifyValues(map)) {
      map.remove("a");
      map.remove("b");
    }

    return map;
  }

  private static boolean verifyValues(Map<String, String> map) {
    return map.containsKey("a") && map.containsKey("b") && Objects.equals(map.get("a"), map.get("b"));
  }
}
