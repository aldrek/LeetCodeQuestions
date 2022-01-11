package com.aldrek.leetcodetwentryquestions

import kotlin.math.max


fun main() {
    print(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}

fun maxSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var sum = 0
    for (element in nums) {
        sum += element
        max = Math.max(sum, max)
        if (sum < 0) sum = 0
    }
    return max
}

