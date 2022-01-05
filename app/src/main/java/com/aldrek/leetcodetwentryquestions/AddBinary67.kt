package com.aldrek.leetcodetwentryquestions

import java.math.BigInteger
import kotlin.math.pow

fun main() {

    print(addBinary( "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","1" ))

}

fun addBinary(a: String?, b: String?): String? {
    val fNumber = BigInteger(a, 2)
    val sNumber = BigInteger(b, 2)
    val sum = fNumber.add(sNumber)
    return sum.toString(2)
}