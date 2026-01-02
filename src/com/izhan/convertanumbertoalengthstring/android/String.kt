package com.izhan.convertanumbertoalengthstring.android

import java.io.*
import java.util.*

object String {
    fun fromLength(length: Length): kotlin.String {
        return "${length.value} ${length.unit}"
    }

    fun fromNumber(number: Number): kotlin.String {
        return number.value.toString()
    }
}
