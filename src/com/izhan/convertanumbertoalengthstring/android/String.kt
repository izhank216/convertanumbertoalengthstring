package com.izhan.convertanumbertoalengthstring.android

object String {
    fun fromLength(length: com.izhan.convertanumbertoalengthstring.android.Length): kotlin.String {
        return "${length.value} ${length.unit}"
    }

    fun fromNumber(number: com.izhan.convertanumbertoalengthstring.android.Number): kotlin.String {
        return number.value.toString()
    }
}
