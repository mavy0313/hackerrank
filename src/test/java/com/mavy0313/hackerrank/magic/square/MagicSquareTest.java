package com.mavy0313.hackerrank.magic.square;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class MagicSquareTest {

    @Test
    void square_is_magic() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(8, 3, 4),
                        List.of(1, 5, 9),
                        List.of(6, 7, 2)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(0);
    }

    @Test
    void square_with_missing_one_number() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(4, 9, 2),
                        List.of(3, 5, 7),
                        List.of(8, 1, 5)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(1);
    }

    @Test
    void square_with_missing_two_numbers() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(4, 9, 2),
                        List.of(2, 5, 7),
                        List.of(8, 1, 5)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(2);
    }

    @Test
    void square_with_missing_three_numbers() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(3, 9, 2),
                        List.of(2, 5, 7),
                        List.of(8, 1, 5)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(3);
    }

    @Test
    void square_with_missing_20_numbers() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(4, 4, 7),
                        List.of(3, 1, 5),
                        List.of(1, 7, 9)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(20);
    }
}
