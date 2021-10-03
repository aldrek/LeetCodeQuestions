package com.aldrek.leetcodetwentryquestions


fun main() {

//    var str = "DCCCXCVII"
//    var value = RomanCharactarsToValue.calculateCharacterToValue(str)
//    print(value)

    var romanValue = 3233
    for (i in 0..3000){
        var a = RomanCharactersToValue.calculateValueToCharacter(i)
        println(a)
        var b = RomanCharactersToValue.calculateCharacterToValue(a)
        println(b)
    }
//    var value1 = RomanCharactersToValue.calculateValueToCharacter(romanValue)
//    print(value1)

}

enum class RomanCharactersToValue(val value: Int) {

    I(1), II(2), III(3), V(5), X(10), L(50), C(100), D(500), M(1000);

    companion object {

        fun identifyValue(char: String) = when (char) {
            "I" -> I.value
            "II" -> II.value
            "III" -> III.value
            "V" -> V.value
            "X" -> X.value
            "C" -> C.value
            "L" -> L.value
            "D" -> D.value
            "M" -> M.value
            else -> I.value
        }

        fun identifyNumberToCharacter(char: String, bigNumber: String, smallNumber: String) =
            when (char) {
                "0" -> ""
                "1" -> I.name
                "2" -> II.name
                "3" -> III.name
                "4" -> "${I.name}${smallNumber}" // 40
                "5" -> smallNumber
                "6" -> "${smallNumber}${I.name}"
                "7" -> "${smallNumber}${I.name}${I.name}"
                "8" -> "${smallNumber}${I.name}${I.name}${I.name}"
                "9" -> "${I.name}${bigNumber}"
                else -> "${smallNumber}${I.name}"
            }

        fun identifyNumberToDecimalRepresentation(char: String, hugeNumber:String ,bigNumber: String, smallNumber: String) =
            when (char) {
                "0" -> ""
                "1" -> smallNumber
                "2" -> "$smallNumber$smallNumber"
                "3" -> "$smallNumber$smallNumber$smallNumber"
                "4" -> "${smallNumber}${bigNumber}"
                "5" -> bigNumber
                "6" -> "${bigNumber}${smallNumber}"
                "7" -> "${bigNumber}${smallNumber}${smallNumber}"
                "8" -> "${bigNumber}${smallNumber}${smallNumber}${smallNumber}"
                "9" -> "${smallNumber}${hugeNumber}"
                else -> "${smallNumber}${smallNumber}"
            }

        fun calculateCharacterToValue(str: String): Int {

            var result = 0
            var lastIndex = str.length
            var isSkipNext = false

            str.forEachIndexed { index, value ->

                if (isSkipNext) {

                    isSkipNext = false
                } else {

                    if (str.length > index + 1) {
                        var fCharactar = "$value"
                        var sCharactar = "${str[index + 1]}"
                        /**
                         *
                         * Know the operation depending on the sequence of every value
                         * -> If the character is bigger than the next it's a solo operation
                         * -> If it's a duplicate it's a addition operation
                         * -> if the character is smaller it's subtraction
                         * ->
                         *
                         */
                        when {
                            valueOf(fCharactar).value > valueOf(sCharactar).value -> {
                                result += valueOf(fCharactar).value
                            }
                            valueOf(fCharactar).value < valueOf(sCharactar).value -> {
                                //subtraction
                                result += valueOf(sCharactar).value - valueOf(fCharactar).value
                                isSkipNext = true
                                // skip next loop
                            }
                            else -> {
                                // equal
                                // addition every duplicate
                                result += valueOf(sCharactar).value

                            }
                        }

                    } else {
                        result += identifyValue("$value")
                        isSkipNext = false
                    }

                }


            }

            return result
        }

        fun calculateValueToCharacter(value: Int): String {

            var result = ""
            var strValue = "$value"
            var array = strValue.toCharArray()
            var position = array.size
            var isSkipNext = false

            array.forEachIndexed { index, number ->
                var currentNumber = "$number".toInt()



                    when (position) {

                        4 -> {
                            result += identifyNumberToDecimalRepresentation(
                                "$currentNumber",
                                D.name,
                                M.name,
                                M.name
                            )

                        }

                        3 -> {

                            // if it's 4 or 9 then it's going to be the two characters subtract
                            // 400 - 499  or 900 - 999

                            result += identifyNumberToDecimalRepresentation(
                                "$currentNumber",
                                M.name,
                                D.name,
                                C.name
                            )

                        }

                        2 -> {

                            //  else represent character as it is

                            result += identifyNumberToDecimalRepresentation(
                                "$currentNumber",
                                C.name,
                                L.name,
                                X.name
                            )

                        }

                        else -> {

                            result +=
                                identifyNumberToDecimalRepresentation(
                                    "$currentNumber",
                                    X.name,
                                    V.name,
                                    I.name
                                )


                        }

                }
                position--

            }
            return result

        }


    }


}