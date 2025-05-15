package others.list;

import java.util.Arrays;
import java.util.List;

public class SortedList {
  private static Integer[] list = {};

  public static Integer size() {
    return list.length;
  }

  public static List<Integer> getList() {
    return Arrays.stream(list).toList();
  }

  public static void insert(int value) {
    Integer[] newList = new Integer[list.length + 1];

    int count = 0;
    while (count < list.length) {
      newList[count] = list[count];
      count++;
    }

    list = insertValue(newList, value, 0);
  }

  private static Integer[] insertValue(Integer[] list, int value, int position) {
    if (list[position] == null) {
      list[position] = value;
    } else {
      if (value > list[position]) {
        insertValue(list, value, position + 1);
      } else {
        for (int i = list.length - 1; i > position; i--) {
          list[i] = list[i - 1];
        }

        list[position] = value;
      }
    }

    return list;
  }
}