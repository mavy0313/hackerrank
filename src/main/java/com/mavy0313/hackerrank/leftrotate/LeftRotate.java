package com.mavy0313.hackerrank.leftrotate;

import java.util.Arrays;

public class LeftRotate {

  static int[] rotLeft(int[] a, int d) {
    int[] result = new int[a.length];

    int lastResultIndex = -1;
    for (int i = 0; i < a.length; i++) {
      if (d + i < a.length) {
        result[i] = a[d + i];
        lastResultIndex = i;
      }
    }

    for (int i = lastResultIndex + 1, j = 0; i < a.length; i++, j++) {
      if (j < d) {
        result[i] = a[j];
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1,2,3,4,5};
    System.out.println(Arrays.asList(rotLeft(a, 2)));
  }
}
