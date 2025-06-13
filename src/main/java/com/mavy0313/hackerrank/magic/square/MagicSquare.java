package com.mavy0313.hackerrank.magic.square;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare {
    /**
     * Magic constant is always 15?? yes for 3 x 3 squares
     * @param square
     * @return
     */
    public int convert(List<List<Integer>> square) {
        int[] magicArray = { 4, 9, 2, 7, 6, 1, 8, 3 }; //sum is 40
        //                   3, 4, 9, 2, 7, 6, 1, 8
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

        int cost;
        List<Integer> costs = new ArrayList<>();
        for (int i = 0; i < squareArray.length; i++) {
            cost = findCost(magicArray, buildSquareArrayStartingFrom(i, squareArray));
            costs.add(cost);
        }

        return costs.stream().min(Integer::compare).orElse(-1);

    }

    private int[] buildSquareArrayStartingFrom(int index, int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + index < array.length) {
                result[i] = array[i + index];
            } else {
                int newIdx = (i + index) - array.length;
                result[i] = array[newIdx];
            }
        }
        return result;
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
