package map_1;

import map_1.topping3.Topping3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestTopping3 {

  @Test
  public void shouldAddFriesWithPotatoValueWhenPotatoIsPresent() {
    Map<String, String> map = new HashMap<>();
    map.put("potato", "butter");

    Map<String, String> result = Topping3.topping3(map);

    Assertions.assertEquals(Map.of("potato", "butter", "fries", "butter"), result);
  }

  @Test
  public void shouldAddSpinachWithSaladValueWhenSaladIsPresent() {
    Map<String, String> map = new HashMap<>();
    map.put("salad", "oil");

    Map<String, String> result = Topping3.topping3(map);

    Assertions.assertEquals(Map.of("salad", "oil", "spinach", "oil"), result);
  }

  @Test
  public void shouldAddSpinachAndFriesWhenPotatoAndSaladExist() {
    Map<String, String> map = new HashMap<>();
    map.put("salad", "oil");
    map.put("potato", "ketchup");

    Map<String, String> result = Topping3.topping3(map);

    Assertions.assertEquals(Map.of("salad", "oil", "spinach", "oil", "potato", "ketchup", "fries", "ketchup"), result);
  }

  @Test
  public void shouldReturnMapUnchangedWhenNoRelevantKeysExist() {
    Map<String, String> map = new HashMap<>();
    map.put("bread", "butter");

    Map<String, String> result = Topping3.topping3(map);

    Assertions.assertEquals(Map.of("bread", "butter"), result);
  }

  @Test
  public void shouldReturnEmptyMapWhenMapIsEmpty() {
    Map<String, String> map = new HashMap<>();

    Map<String, String> result = Topping3.topping3(map);

    Assertions.assertEquals(Map.of(), result);
  }

  @Test
  public void shouldReturnMapUnchangedWhenOnlyEmptyValuesExist() {
    Map<String, String> map = new HashMap<>();
    map.put("potato", "");
    map.put("salad", "");

    Map<String, String> result = Topping3.topping3(map);

    Assertions.assertEquals(Map.of("potato", "", "salad", ""), result);
  }
}
