//Example 1: Kotlin Program to Check Alphabet using if else

//fun main(args: Array<String>) {
//
//    val c = '*'
//
//    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
//        println("$c is an alphabet.")
//    else
//        println("$c is not an alphabet.")
//}


//Example 2: Kotlin Program to Check Alphabet using if else with ranges

fun main(args: Array<String>) {

    val c = 'a'

    if (c in 'a'..'z' || c in 'A'..'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}