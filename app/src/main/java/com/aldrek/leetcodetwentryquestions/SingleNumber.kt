package com.aldrek.leetcodetwentryquestions

 fun main(){

     val list = intArrayOf( 2 , 2 , 3 , 2 , 1 , 3 )
     var result  = getSingleNumber(list)
     println(result)

}

fun getSingleNumber(list: IntArray): Int {

    list.forEachIndexed { index, item ->

       if(list.count {it == item  } == 1) return  item

    }
return 0
}

class SingleNumber {
}