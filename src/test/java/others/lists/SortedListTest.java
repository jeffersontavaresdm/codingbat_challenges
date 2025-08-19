package others.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import others.list.SortedList;

import java.util.Arrays;

public class SortedListTest {

  @Test
  void insertTest() {
    Assertions.assertEquals(0, SortedList.size());

    SortedList.insert(5);

    Assertions.assertEquals(1, SortedList.size());

    SortedList.insert(7);

    Assertions.assertEquals(2, SortedList.size());

    SortedList.insert(1);

    Assertions.assertEquals(3, SortedList.size());

    Assertions.assertEquals(Arrays.asList(1, 5, 7), SortedList.getList());
  }
}
