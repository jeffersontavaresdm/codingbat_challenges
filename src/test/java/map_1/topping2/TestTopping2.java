package map_1.topping2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestTopping2 {

  @Test
  public void shouldNotChangeAnything() {
    HashMap<String, String> map = new HashMap<>();
    map.put("yogurt", "salt");

    Map<String, String> result = Topping2.topping2(map);

    Assertions.assertEquals(Map.of("yogurt", "salt"), result);
  }

  @Test
  public void shouldAddYogurtKeyWithIceCreamValueWhenIceCreamExists() {
    HashMap<String, String> map = new HashMap<>();
    map.put("ice cream", "cherry");

    Map<String, String> result = Topping2.topping2(map);

    Assertions.assertEquals(Map.of("yogurt", "cherry", "ice cream", "cherry"), result);
  }

  @Test
  public void shouldChangeSpinachValueToNutsIfExists() {
    HashMap<String, String> map = new HashMap<>();
    map.put("spinach", "dirt");
    map.put("ice cream", "cherry");

    Map<String, String> result = Topping2.topping2(map);

    Assertions.assertEquals(Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"), result);
  }
}
