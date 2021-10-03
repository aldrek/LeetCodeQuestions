package com.aldrek.leetcodetwentryquestions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

fun main() {
    var nums = intArrayOf(2, 6, 4, 8, 10, 9, 15)
//    var value = getSortedArrayIndex(nums)
//    print(value)

    // ---------------------------- Sum of two numbers
//    var twoSumsList = intArrayOf(3 , 2 , 4)
//    var value1 = twoSums(twoSumsList, 6)
//    print(value1.toString())

    // ---------------------------- CountNumbersOfPairs
//        var CountNumbersOfPairsList = intArrayOf(3, 2, 1, 5, 4)
//        var value2 = countNumbersOfPairs(CountNumbersOfPairsList, 2)
//        print(value2.toString())

    // ---------------------------- CountNumbersOfPairs
//        var finalValueOfVariableAfterPerformingOperationslist:Array<String> =  arrayOf<String>("--X","X++","X++")
//        var value3 = finalValueOfVariableAfterPerformingOperations(finalValueOfVariableAfterPerformingOperationslist)
//        print(value3.toString())

// ---------------------------- reverseInteger
//    var value5 = reverseInteger(123)
//    print(value5)

    //

}


fun reverseInteger(value: Int): Int {

    var result = 0
    if (value >= 0)

        result = "$value".reversed().toCheckThirtyThree()
    else {
        var valueTosend = "$value".removeRange(0, 1).reversed()
        result = -(valueTosend.toCheckThirtyThree())
    }

    if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE)
        return 0
    else {
        return result
    }

}

private fun String.toCheckThirtyThree(): Int {
    return if (isInteger(this)) {
        this.toInt()
    } else {
        0
    }
}

fun isInteger(str: String?) = str?.toIntOrNull()?.let { true } ?: false

private fun finalValueOfVariableAfterPerformingOperations(
    operations: Array<String>
): Any {

    var result = 0
    operations.forEach {
        if (OperationRepresentation.getValue(it).equals(OperationRepresentation.additional)) {
            result++
        } else {
            result--
        }
    }
    return result
}

enum class OperationRepresentation() {
    additional, substraction;

    companion object {
        fun getValue(value: String) = when (value) {
            "X++" -> additional
            "++X" -> additional
            "--X" -> substraction
            "X--" -> substraction
            else -> substraction
        }
    }

}

fun twoSums(list: IntArray, target: Int): IntArray {

    list.forEachIndexed { index, entry ->

        list.forEachIndexed { index1, entry1 ->

            // Not last index
            if (index != index1) {
                if (entry + entry1 == target) {
                    return intArrayOf(index, index1)
                }
            }

        }

    }

    return intArrayOf(0, 0)

}

fun countNumbersOfPairs(list: IntArray, target: Int): Int {
    var count = 0
    list.forEachIndexed { index, entry ->

        list.forEachIndexed { index1, entry1 ->

            if (index != index1) {
                if (entry - entry1 == target) {
                    count++
                }
            }

        }

    }

    return count
}

fun getSortedArrayIndex(list: IntArray): Int {

    var fromIndex = 0
    var toIndex = 0

    list.forEachIndexed { index, entry ->

        if (index + 1 != list.size) {
            if (entry > list[index + 1]) {
                if (fromIndex == 0) {
                    fromIndex = index
                } else {
                    toIndex = index
                }
            } else {

            }

        }

    }

    if (fromIndex != 0) {
        return toIndex - fromIndex + 1
    } else {
        return 0
    }

}

