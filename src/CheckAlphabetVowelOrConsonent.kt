//Example 1: Check whether an alphabet is vowel or consonant using if..else statement

//fun main(args: Array<String>) {
//
//    val ch = 'i'
//
//    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"
//
//    println("$ch is $vowelConsonant")
//}

//Example 2: Check whether an alphabet is vowel or consonant using when statemen

fun main(args: Array<String>) {

    val ch = 'z'

    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}