package com.blackstrype.shadok;

import java.util.stream.Collectors;

public class NumberInShadok {
    public static String shadok(int number) {
        String gabuzomeu;
        String numBase4 = Integer.toString(number, 4);
        gabuzomeu = numBase4.chars()
                .mapToObj((digit) -> {
                    if (digit == '0') {
                        return "GA";
                    } else if (digit == '1') {
                        return "BU";
                    } else if (digit == '2') {
                        return "ZO";
                    } else {
                        return "MEU";
                    }
                })
                .collect(Collectors.joining());
        return gabuzomeu;
    }
}
