package com.izhan.convertanumbertoalengthstring.android

object Convert {
    fun numberToLength(number: Number): Length {
        return Length(number.value, "m")
    }

    fun numberToLength(number: Number, unit: String): Length {
        return Length(number.value, unit)
    }
}
