package com.aldrek.leetcodetwentryquestions

fun main (){
    print(isPalindrome(""))
}

fun isPalindrome(s: String): Boolean {

    val re = Regex("[^A-Za-z0-9]")
    var result = re.replace(s.toLowerCase(), "")
    var reversedResult = result.reversed()
    print(result +"\n")
    print(reversedResult+"\n")

    return result.equals(reversedResult)
}
