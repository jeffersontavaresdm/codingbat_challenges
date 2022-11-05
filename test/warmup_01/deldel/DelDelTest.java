package warmup_01.deldel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warmup_1.DelDel.solutions.Solution01;

public class DelDelTest {

  @Test
  void solution01Test() {
    Assertions.assertEquals("abc", Solution01.delDel("adelbc"));
    Assertions.assertEquals("aHello", Solution01.delDel("adelHello"));
    Assertions.assertEquals("adedbc", Solution01.delDel("adedbc"));
  }
}
