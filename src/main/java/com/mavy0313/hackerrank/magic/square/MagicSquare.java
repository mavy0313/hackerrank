package com.mavy0313.hackerrank.magic.square;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare {

    public int convert(List<List<Integer>> square) {
        int[] inputSquareArray = {
                square.get(0).get(0),
                square.get(0).get(1),
                square.get(0).get(2),
                square.get(1).get(0),
                square.get(1).get(1),
                square.get(1).get(2),
                square.get(2).get(0),
                square.get(2).get(1),
                square.get(2).get(2),
        };

        List<Integer> costs = new ArrayList<>();
        for (int[] magicSquare : getMagicSquares()) {
            int cost = findCost(inputSquareArray, magicSquare);
            if (cost == 0) return 0;
            costs.add(cost);
        }
        return costs.stream().min(Integer::compare).orElse(-1);
    }

    private static int[][] getMagicSquares() {
        return new int[][] {
            { 8, 3, 4, 1, 5, 9, 6, 7, 2 },
            { 6, 7, 2, 1, 5, 9, 8, 3, 4 },
            { 6, 1, 8, 7, 5, 3, 2, 9, 4 },
            { 2, 9, 4, 7, 5, 3, 6, 1, 8 },
            { 2, 7, 6, 9, 5, 1, 4, 3, 8 },
            { 4, 3, 8, 9, 5, 1, 2, 7, 6 },
            { 4, 9, 2, 3, 5, 7, 8, 1, 6 },
            { 8, 1, 6, 3, 5, 7, 4, 9, 2 },
        };
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
