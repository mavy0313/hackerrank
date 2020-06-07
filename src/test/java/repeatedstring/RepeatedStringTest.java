package repeatedstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

  @Test
  public void should_repeat_two_times_two_symbols() {
    //given
    RepeatedString repeatedString = new RepeatedString("ab", 2);

    //when
    String result = repeatedString.show();

    //then
    assertEquals("abab", result);
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
  public void shouldFindTwoAFromTwoN() {
    //given
    RepeatedString repeatedString = new RepeatedString("a", 2);

    //when
    long result = repeatedString.count('a');

    //then
    assertEquals(2, result);
  }
}
