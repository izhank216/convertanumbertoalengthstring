package com.izhan.convertanumbertoalengthstring;

public class Length {
    private double value;
    private String unit;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
