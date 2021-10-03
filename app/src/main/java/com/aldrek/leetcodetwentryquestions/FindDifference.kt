package com.aldrek.leetcodetwentryquestions

fun main() {

    var array = arrayListOf("" , "" , "")
    var arrayOfInt = intArrayOf(10 , 20 , 30 , 40)
    var arrayHash = hashMapOf<String , String>()

    arrayHash[""] = ""

    var arrayOne = "a"
    var arrayTwo = "aa"
    var value = findDifference(arrayOne, arrayTwo)
    print(value)

}

fun findDifference(arrayOne: String, arrayTwo: String) : Char {
    var mergedArray = "$arrayOne$arrayTwo"

    mergedArray.forEach { char ->
    var count = mergedArray.count { it == char  }
        if(count == 1 || count % 2 != 0){
            return char
        }
    }

return '-'

}



