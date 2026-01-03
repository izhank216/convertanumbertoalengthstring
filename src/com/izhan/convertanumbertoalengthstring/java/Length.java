package com.izhan.convertanumbertoalengthstring;

public class Length {
    private double value;
    private java.lang.String unit;

    public Length(double value, java.lang.String unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public java.lang.String getUnit() {
        return unit;
    }

    @Override
    public java.lang.String toString() {
        return value + " " + unit;
    }

    public java.lang.String toCustomString() {
        return com.izhan.convertanumbertoalengthstring.String.fromLength(this);
    }
}
