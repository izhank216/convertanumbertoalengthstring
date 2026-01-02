package com.izhan.convertanumbertoalengthstring;

public class Convert {
    public static Length numberToLength(Number number) {
        return new Length(number.getValue(), "m");
    }

    public static Length numberToLength(Number number, String unit) {
        return new Length(number.getValue(), unit);
    }
}
