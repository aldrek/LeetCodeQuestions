package com.aldrek.leetcodetwentryquestions

fun main() {

   print(isPalindrome(1211111121))

}

fun isPalindrome(x: Int): Boolean {

    var str = x.toString().toCharArray()
    var isPalindromeValue = true

    if (str.size == 1) return isPalindromeValue

    var isEven = str.size % 2 == 0

    for ((position, character) in str.withIndex()) {

        if (!isEven && position == str.size / 2) continue
        else {
            if (character != str[(str.size-1) - position]) {
                isPalindromeValue = false
            }
        }

    }

    return isPalindromeValue

}

