package com.aldrek.leetcodetwentryquestions

fun main(){
    print(revertInteger(-123))
}

fun revertInteger(value: Int): Int {

    if( value < 4294967296 || value > -4294967296 ){
        var result = 0
        if (value >= 0) {

            var reverted = "$value".reversed().toIntOrNull()
            if (reverted == null ) {
                result = 0
            } else {
                return reverted
            }
        }else {
            var reverted = "$value".removeRange(0, 1).reversed().toIntOrNull()
            if(  reverted == null ){
                result = 0
            }else{
               result =  -(reverted)
            }
        }

        return result
    }


    else {
        return  0
    }

}



class RevertNumber {
}