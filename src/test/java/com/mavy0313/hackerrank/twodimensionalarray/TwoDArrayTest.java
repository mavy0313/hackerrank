package com.mavy0313.hackerrank.twodimensionalarray;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDArrayTest {

  @Test
  public void shouldReturnMaxHourGlassSum() {
    //given
    TwoDArray twoDArray = new TwoDArray();
    int[][] arr = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };

    //when
    int maxSum = twoDArray.hourGlassMaxSum(arr);

    //then
    assertEquals(19, maxSum);
  }
}
