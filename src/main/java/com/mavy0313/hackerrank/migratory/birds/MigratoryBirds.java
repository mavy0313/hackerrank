package com.mavy0313.hackerrank.migratory.birds;

public class MigratoryBirds {
    private final int[] birds;

    public MigratoryBirds(int[] birds) {
        this.birds = birds;
    }

    public int find() {
        int bird1count = 0;
        int bird2count = 0;
        int bird3count = 0;
        int bird4count = 0;
        int bird5count = 0;

        for (int i = 0; i < birds.length; i++) {
            if (birds[i] == 1) {
                bird1count++;
            } else if (birds[i] == 2) {
                bird2count++;
            } else if (birds[i] == 3) {
                bird3count++;
            } else if (birds[i] == 4) {
                bird4count++;
            } else if (birds[i] == 5) {
                bird5count++;
            }
        }

        int[] maximums = { bird1count, bird2count, bird3count, bird4count, bird5count };

        int max = bird1count;
        int maxType = 1;
        for (int i = 0; i < 5; i++) {
            if (maximums[i] > max) {
                max = maximums[i];
                maxType = i + 1;
            }
        }

        return maxType;
    }
}
