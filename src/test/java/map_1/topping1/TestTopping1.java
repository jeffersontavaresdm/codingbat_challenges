package map_1.topping1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestTopping1 {

  @Test
  public void shouldAddBreadKeyWithButterValue() {
    Map<String, String> map = new HashMap<>();

    Map<String, String> result = Topping1.topping1(map);

    Assertions.assertEquals(Map.of("bread", "butter"), result);
  }

  @Test
  public void shouldAddBreadKeyWithButterValueInAllCases() {
    Map<String, String> map = new HashMap<>();
    map.put("pancake", "syrup");

    Map<String, String> result = Topping1.topping1(map);

    Assertions.assertEquals(Map.of("bread", "butter", "pancake", "syrup"), result);
  }

  @Test
  public void shouldChangeValueToCherryWhenKeyIsIceCream() {
    Map<String, String> map = new HashMap<>();
    map.put("ice cream", "peanuts");

    Map<String, String> result = Topping1.topping1(map);

    Assertions.assertEquals("cherry", result.get("ice cream"));
  }
}
