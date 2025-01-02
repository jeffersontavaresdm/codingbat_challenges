package map_1.mapAB2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MapAB2Test {

  @Test
  void shouldNotChangeIfKeysAAndBDoNotHaveTheSameValues() {
    HashMap<String, String> map = new HashMap<>();
    map.put("a", "aaa");
    map.put("b", "bbb");

    Map<String, String> result = MapAB2.mapAB2(map);

    Assertions.assertEquals(Map.of("a", "aaa", "b", "bbb"), result);
  }

  @Test
  void shouldRemoveKeysAAndBIfTheyHaveTheSameValues() {
    HashMap<String, String> map = new HashMap<>();
    map.put("a", "aaa");
    map.put("b", "aaa");
    map.put("c", "cake");

    Map<String, String> result = MapAB2.mapAB2(map);

    Assertions.assertEquals(Map.of("c", "cake"), result);
  }

  @Test
  void shouldNotChangeIfKeyAIsMissing() {
    HashMap<String, String> map = new HashMap<>();
    map.put("b", "bbb");

    Map<String, String> result = MapAB2.mapAB2(map);

    Assertions.assertEquals(Map.of("b", "bbb"), result);
  }

  @Test
  void shouldNotChangeIfKeyBIsMissing() {
    HashMap<String, String> map = new HashMap<>();
    map.put("a", "aaa");

    Map<String, String> result = MapAB2.mapAB2(map);

    Assertions.assertEquals(Map.of("a", "aaa"), result);
  }

  @Test
  void shouldNotChangeIfNeitherKeyAnorKeyBArePresent() {
    HashMap<String, String> map = new HashMap<>();
    map.put("c", "cake");

    Map<String, String> result = MapAB2.mapAB2(map);

    Assertions.assertEquals(Map.of("c", "cake"), result);
  }

  @Test
  void shouldHandleEmptyMap() {
    HashMap<String, String> map = new HashMap<>();

    Map<String, String> result = MapAB2.mapAB2(map);

    Assertions.assertEquals(Map.of(), result);
  }
}
