package com.izhan.convertanumbertoalengthstring;

import java.io.*;
import java.util.*;

public class String {
    public static java.lang.String fromLength(Length length) {
        return length.getValue() + " " + length.getUnit();
    }

    public static java.lang.String fromNumber(Number number) {
        return java.lang.String.valueOf(number.getValue());
    }
}
