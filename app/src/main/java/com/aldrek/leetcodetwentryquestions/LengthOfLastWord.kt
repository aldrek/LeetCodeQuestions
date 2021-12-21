package com.aldrek.leetcodetwentryquestions

fun main(){

    print(lengthOfLastWord("   fly me   to   the moon  "))
    print("   fly me   to   the moon  ".trim().split(" "))
}

fun lengthOfLastWord(s: String): Int {
    return  s.trim().split(" ").last().toCharArray().size
}

