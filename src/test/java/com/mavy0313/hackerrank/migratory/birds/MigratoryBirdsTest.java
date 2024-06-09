package com.mavy0313.hackerrank.migratory.birds;

import org.junit.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class MigratoryBirdsTest {
    @Test
    public void findLowestBirdIdOfMostFrequentlySighted() {
        int[] birds = new int[]{1};
        MigratoryBirds migratoryBirds = new MigratoryBirds(birds);

        int result = migratoryBirds.find();

        then(result).isEqualTo(1);
    }
}
