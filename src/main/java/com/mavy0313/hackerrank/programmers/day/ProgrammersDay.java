package com.mavy0313.hackerrank.programmers.day;

public class ProgrammersDay {
    private final int year;

    public ProgrammersDay(int year) {
        this.year = year;
    }

    public String calculate() {
        if (year < 1919) {
            return calculate(isLeapForJulian());
        } else {
            return calculate(isLeapForGregorian());
        }
    }

    private boolean isLeapForJulian() {
        return year % 4 == 0;
    }

    private boolean isLeapForGregorian() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private String calculate(boolean isLeap) {
        int daysInFebruary = isLeap ? 29 : 28;
        if (year == 1918) {
            daysInFebruary = 15;
        }
        int daysTillSeptember = 31 + daysInFebruary + 31 + 30 + 31 + 30 + 31 + 31;
        int result = 256 - daysTillSeptember;
        return result + ".09." + year;
    }

}
