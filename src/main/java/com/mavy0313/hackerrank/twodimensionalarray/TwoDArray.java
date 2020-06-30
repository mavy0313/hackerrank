package com.mavy0313.hackerrank.twodimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {
  public int hourGlassMaxSum(int[][] arr) {
    List<Integer> maximums = getAllHourGlassSums(arr);
    return getMax(maximums);
  }

  private List<Integer> getAllHourGlassSums(int[][] arr) {
    int hourGlassSum = 0;
    List<Integer> maximums = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        hourGlassSum =
            arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
            arr[i + 1][j + 1] +
            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
          maximums.add(hourGlassSum);
      }
    }
    return maximums;
  }

  private int getMax(List<Integer> maximums) {
    int max = maximums.get(0);
    for (int i = 1; i < maximums.size(); i++) {
      if (maximums.get(i) > max) {
        max = maximums.get(i);
      }
    }
    return max;
  }
}
