package com.mavy0313.hackerrank.magic.square;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class MagicSquareTest {
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
    void square_with_missing_one_number_and_shifted_one_step_forward() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(4, 4, 9),
                        List.of(8, 5, 2),
                        List.of(1, 6, 7)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(1);
    }

    @Test
    void square_with_missing_two_numbers_and_shifted_one_step_forward() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(4, 5, 9),
                        List.of(8, 5, 2),
                        List.of(1, 6, 7)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(2);
    }

    @Test
    void square_with_missing_three_numbers_and_shifted_one_step_forward() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(4, 5, 9),
                        List.of(8, 5, 1),
                        List.of(1, 6, 7)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(3);
    }

    @Test
    void square_with_missing_one_number_and_shifted_one_step_backward() {
        //given
        MagicSquare magicSquare = new MagicSquare();
        List<List<Integer>> square =
                List.of(
                        List.of(9, 2, 7),
                        List.of(4, 5, 6),
                        List.of(4, 8, 1)
                );

        //when
        int result = magicSquare.convert(square);

        //then
        then(result).isEqualTo(1);
    }
}
