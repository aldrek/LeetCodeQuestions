package com.aldrek.leetcodetwentryquestions

import java.math.BigInteger

fun main(){

    print(plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0)))
}


fun plusOne(digits: IntArray): IntArray {

    if(digits.size == 1 ) return intToArrayInt((digits[0]+1).toBigInteger())

    var valueToSum = ""

    for((position, number) in digits.withIndex()){
        valueToSum = "$valueToSum$number"
    }

    var total = valueToSum.toBigInteger() + BigInteger.valueOf(1)

    return intToArrayInt(total)
}


fun intToArrayInt(number: BigInteger): IntArray{
    var list = mutableListOf<Int>()
    for(char in number.toString().toCharArray()){
        list.add(char.toString().toInt())
    }
   return list.toIntArray()
}