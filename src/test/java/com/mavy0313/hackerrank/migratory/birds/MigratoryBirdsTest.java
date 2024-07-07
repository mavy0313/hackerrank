package com.mavy0313.hackerrank.migratory.birds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class MigratoryBirdsTest {
    @Test
    public void findFromOneBird() {
        int[] birds = new int[]{1};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(1);
    }

    @Test
    public void findFromFiveBirds() {
        int[] birds = new int[] {1, 2, 3, 4, 5};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(1);
    }

    @Test
    public void findFromSixBirds() {
        int[] birds = new int[] {1, 2, 3, 4, 5, 5};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(5);
    }

    @Test
    public void findFromMaxDuplicates() {
        int[] birds = new int[] {1, 1, 2, 2, 3, 4, 5};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(1);
    }

    @Test
    public void findFrom3MaxDuplicates() {
        int[] birds = new int[] {1, 1, 2, 2, 3, 4, 5, 5};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(1);
    }

    @Test
    public void findFromMaxOf3() {
        int[] birds = new int[] {1, 1, 2, 2, 3, 4, 5, 5, 5};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(5);
    }
}
