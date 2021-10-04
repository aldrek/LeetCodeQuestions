package com.aldrek.leetcodetwentryquestions

fun main(){
    var list: Array<String> = arrayOf("a")
    var result =  findLongestPrefix(list.toMutableList())
    var finalResult = result.groupingBy { it }.eachCount().filter { it.value ==  list.size }
    if( finalResult.keys.isEmpty()){
       print("")
    }
    println(finalResult.keys.toMutableList()[finalResult.keys.size-1])
}

fun findLongestPrefix(list: MutableList<String>) : MutableList<String> {
    var prefixArray = mutableListOf<String>()

    list.forEachIndexed { index, item ->

        var endPoint = 1
        var word = item

        word.toCharArray().forEachIndexed { index, char ->
            prefixArray.add(word.substring(0,endPoint))
            endPoint++

        }

    }

    return prefixArray

}

class LongestPrefix {


}