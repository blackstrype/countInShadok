package com.blackstrype.shadok;

public class ShadokInNumber {
    public static int shadok(String gabuzomeu) {
        String base4Number = gabuzomeu
                .replaceAll("GA", "0")
                .replaceAll("BU", "1")
                .replaceAll("ZO", "2")
                .replaceAll("MEU", "3");
        return Integer.parseInt(base4Number, 4);
    }
}
