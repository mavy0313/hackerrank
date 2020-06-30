package com.mavy0313.hackerrank.repeatedstring;

class RepeatedString {
  private final String s;
  private final String repeatedString;
  private final long n;

  public RepeatedString(String s, long n) {
    this.s = s;
    this.n = n;
    this.repeatedString = repeat();
  }

  private String repeat() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      result.append(s);
    }
    return result.toString();
  }

  public long count(char arg) {
    long result = 0L;
    if (s.length() == n) {
      result = findAndCount(s, arg);
    } else if (s.length() > n) {
      result = findAndCount(s.substring(0, new Long(n).intValue()), arg);
    } else if (s.length() < n) {
      long priv = n / new Long(s.length()).intValue();
      long remainder = n % new Long(s.length()).intValue();
      result = findAndCount(s, arg) * priv;
      if (remainder > 0) {
        result = result + findAndCount(s.substring(0, new Long(remainder).intValue()), arg);
      }
    }
    return result;
  }

  private long findAndCount(String s, char arg) {
    return s.chars()
          .mapToObj(c -> (char) c)
          .filter(c -> c == arg)
          .count();
  }

  public String show() {
    return repeatedString;
  }
}
