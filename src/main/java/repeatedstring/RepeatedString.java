package repeatedstring;

class RepeatedString {
  private final String s;
  private final String repeatedString;
  private final int n;

  public RepeatedString(String s, int n) {
    this.s = s;
    this.n = n;
    this.repeatedString = repeat();
  }

  private String repeat() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(s);
    }
    return result.toString();
  }

  public long count(char arg) {
    long sCount = s.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> c == arg)
        .count();

    return sCount * n;
  }

  public String show() {
    return repeatedString;
  }
}
