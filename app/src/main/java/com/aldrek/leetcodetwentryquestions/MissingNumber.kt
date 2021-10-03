package com.aldrek.leetcodetwentryquestions

    fun main(){
        var nums = intArrayOf(9,6,4,2,3,5,7,0,1)
        var result = missingNumberValue(nums)
        print(result)
    }

fun missingNumberValue(nums: IntArray): Int {
    var startingPoint = 0
    var endPoint = nums.size
    // we could sort then find the missing
    var sum =0
    var expectedSum = 0

    for (i in 0..nums.size){
        expectedSum += i
        if(i < nums.size)
        sum += nums[i]
    }
    if(expectedSum - sum == 0 )return 0

    return expectedSum - sum
}
