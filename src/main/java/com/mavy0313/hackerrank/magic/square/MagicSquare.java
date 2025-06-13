package com.mavy0313.hackerrank.magic.square;

import java.util.List;

public class MagicSquare {
    /**
     * Magic constant is always 15?? yes for 3 x 3 squares
     * @param square
     * @return
     */
    public int convert(List<List<Integer>> square) {
        int[] magicArray = { 4, 9, 2, 7, 6, 1, 8, 3 };
        //check middle 5
        int[] squareArray = {
                square.get(0).get(0),
                square.get(0).get(1),
                square.get(0).get(2),
                square.get(1).get(2),
                square.get(2).get(2),
                square.get(2).get(1),
                square.get(2).get(0),
                square.get(1).get(0),
        };
        return findCost(magicArray, squareArray);

    }

    private int findCost(int[] magicArray, int[] squareArray) {
        int cost = 0;
        for (int i = 0; i < magicArray.length; i++) {
            if (magicArray[i] != squareArray[i]) {
                cost = cost + Math.abs((magicArray[i] - squareArray[i]));
            }
        }
        return cost;
    }
}
