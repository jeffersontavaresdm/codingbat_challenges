package warmup_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringTimes {

    @Test
    public void shouldReturnRepeatedStringWhenNIsGreaterThanOne() {
        String result = StringTimes.stringTimes("Hi", 2);
        Assertions.assertEquals("HiHi", result);
    }

    @Test
    public void shouldReturnRepeatedStringWhenNIsThree() {
        String result = StringTimes.stringTimes("Hi", 3);
        Assertions.assertEquals("HiHiHi", result);
    }

    @Test
    public void shouldReturnOriginalStringWhenNIsOne() {
        String result = StringTimes.stringTimes("Hi", 1);
        Assertions.assertEquals("Hi", result);
    }

    @Test
    public void shouldReturnEmptyStringWhenNIsZero() {
        String result = StringTimes.stringTimes("Hi", 0);
        Assertions.assertEquals("", result);
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsEmpty() {
        String result = StringTimes.stringTimes("", 5);
        Assertions.assertEquals("", result);
    }

    @Test
    public void shouldReturnSingleCharacterWhenNIsOneAndStringIsOneCharacter() {
        String result = StringTimes.stringTimes("H", 1);
        Assertions.assertEquals("H", result);
    }

    @Test
    public void shouldReturnRepeatedStringUsingDeprecatedMethodWhenNIsTwo() {
        String result = StringTimes.deprecatedStringTimes("Hi", 2);
        Assertions.assertEquals("HiHi", result);
    }

    @Test
    public void shouldReturnRepeatedStringUsingDeprecatedMethodWhenNIsThree() {
        String result = StringTimes.deprecatedStringTimes("Hi", 3);
        Assertions.assertEquals("HiHiHi", result);
    }

    @Test
    public void shouldReturnOriginalStringUsingDeprecatedMethodWhenNIsOne() {
        String result = StringTimes.deprecatedStringTimes("Hi", 1);
        Assertions.assertEquals("Hi", result);
    }

    @Test
    public void shouldReturnEmptyStringUsingDeprecatedMethodWhenNIsZero() {
        String result = StringTimes.deprecatedStringTimes("Hi", 0);
        Assertions.assertEquals("", result);
    }
}
