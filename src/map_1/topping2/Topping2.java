package map_1.topping2;

import java.util.Map;

/**
 * Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream"
 * has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value
 * to "nuts".
 * <p>
 * <p>
 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
 * topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class Topping2 {

  public static Map<String, String> topping2(Map<String, String> map) {
    if (map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));

    String spinachValue = map.getOrDefault("spinach", null);
    if (spinachValue != null && !spinachValue.isEmpty()) map.put("spinach", "nuts");

    return map;
  }
}
