package com.mavy0313.hackerrank.programmers.day;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ProgrammersDayTest {

    @Test
    public void calculateNonLeapYear() {
        ProgrammersDay day = new ProgrammersDay(2017);

        String programmersDay = day.calculate();

        then(programmersDay).isEqualTo("13.09.2017");
    }

    @Test
    public void calculateLeapYear() {
        ProgrammersDay day = new ProgrammersDay(1984);

        String programmersDay = day.calculate();

        then(programmersDay).isEqualTo("12.09.1984");
    }

    @Test
    public void calculateLeapYearJulian() {
        ProgrammersDay day = new ProgrammersDay(1888);

        String programmersDay = day.calculate();

        then(programmersDay).isEqualTo("12.09.1888");
    }

    @Test
    public void calculateNonLeapYearJulian() {
        ProgrammersDay day = new ProgrammersDay(1765);

        String programmersDay = day.calculate();

        then(programmersDay).isEqualTo("13.09.1765");
    }

    @Test
    public void calculate1918() {
        ProgrammersDay day = new ProgrammersDay(1918);

        String programmersDay = day.calculate();

        then(programmersDay).isEqualTo("26.09.1918");
    }
}
