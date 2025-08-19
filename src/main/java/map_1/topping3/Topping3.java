package map_1.topping3;

import java.util.Map;

/**
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a
 * value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the
 * key "spinach".
 * <p>
 * <p>
 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries":
 * "ketchup"}
 */
public class Topping3 {

  public static Map<String, String> topping3(Map<String, String> map) {
    if (verifyKey(map, "potato")) map.put("fries", map.get("potato"));
    if (verifyKey(map, "salad")) map.put("spinach", map.get("salad"));
    return map;
  }

  private static boolean verifyKey(Map<String, String> map, String key) {
    return map.containsKey(key) && map.get(key) != null && !map.get(key).isEmpty();
  }
}
