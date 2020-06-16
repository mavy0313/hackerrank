package repeatedstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

  @Test
  public void shouldRepeatHundredTimesTwoSymbols() {
    //given
    RepeatedString repeatedString = new RepeatedString("ab", 2);

    //when
    String result = repeatedString.show();

    //then
    assertEquals("ababababababababababababababababababababababababababababababababababababababababababababab" +
            "abababababababababababababababababababababababababab" +
            "ababababababababababababababababababababababababababababab",
        result);
    assertEquals(200, result.length());
  }

  @Test
  public void shouldFindOneAFromOneN() {
    //given
    RepeatedString repeatedString = new RepeatedString("a", 1);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(1, result);
  }

  @Test
  public void shouldFindAWhenSLengthLessThenNWithRemainder() {
    //given
    RepeatedString repeatedString = new RepeatedString("ab", 3);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(2, result);
  }

  @Test
  public void shouldFindAWhenSLengthLessThenNWithoutRemainder() {
    //given
    RepeatedString repeatedString = new RepeatedString("ab", 6);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(3, result);
  }

  @Test
  public void shouldFindAWhenSLengthLessThenBigNWithoutRemainder() {
    //given
    RepeatedString repeatedString = new RepeatedString("a", 1000000000000L);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(1000000000000L, result);
  }

  @Test
  public void shouldNotFindAnyAFromTwoN() {
    //given
    RepeatedString repeatedString = new RepeatedString("b", 2);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(0, result);
  }

  @Test
  public void shouldFindAWhenSLengthEqualsToN() {
    //given
    RepeatedString repeatedString = new RepeatedString("aba", 3);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(2, result);
  }

  @Test
  public void shouldFindAWhenSLengthGreaterThenN() {
    //given
    RepeatedString repeatedString = new RepeatedString("aba", 2);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(1, result);
  }
}
