package com.izhan.convertanumbertoalengthstring.android

object Convert {
    fun numberToLength(number: com.izhan.convertanumbertoalengthstring.android.Number): com.izhan.convertanumbertoalengthstring.android.Length {
        return com.izhan.convertanumbertoalengthstring.android.Length(number.value, "m")
    }

    fun numberToLength(number: com.izhan.convertanumbertoalengthstring.android.Number, unit: kotlin.String): com.izhan.convertanumbertoalengthstring.android.Length {
        return com.izhan.convertanumbertoalengthstring.android.Length(number.value, unit)
    }
}
