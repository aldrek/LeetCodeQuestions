package com.aldrek.leetcodetwentryquestions

fun main() {

    var duplicateArray = intArrayOf(2, 2, 4  , 1  ,  4)
    var value1 = SingleDuplicate.findSingleOccurrence(duplicateArray)
    print(value1.toString())

}

class SingleDuplicate {

    companion object {

        fun findSingleOccurrence(duplicateArray: IntArray): Int {

            duplicateArray.forEach { value ->
                if (duplicateArray.count { it == value } == 1) {
                    return value
                }

            }



            return 0
        }

    }


}