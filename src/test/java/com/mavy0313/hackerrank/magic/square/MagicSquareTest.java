package com.mavy0313.hackerrank.magic.square;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class MagicSquareTest {
    @Test
    void squareWithOnes() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(1, 1, 1),
                        List.of(1, 1, 1),
                        List.of(1, 1, 1)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(0);
    }
}
