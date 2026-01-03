package com.izhan.convertanumbertoalengthstring;

public class Convert {
    public static Length numberToLength(Number number) {
        return new Length(number.getValue(), "m");
    }

    public static Length numberToLength(Number number, java.lang.String unit) {
        return new Length(number.getValue(), unit);
    }

    public static java.lang.String lengthToString(Length length) {
        return String.fromLength(length);
    }

    public static java.lang.String numberToString(Number number) {
        return String.fromNumber(number);
    }
}
