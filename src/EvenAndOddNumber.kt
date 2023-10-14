import java.util.*

//Example 1: Check whether a number is even or odd using if...else statement

//fun main(args: Array<String>) {
//
//    val reader = Scanner(System.`in`)
//
//    print("Enter a number: ")
//    val num = reader.nextInt()
//
//    if (num % 2 == 0)
//        println("$num is even")
//    else
//        println("$num is odd")
//}

//Example 2: Check whether a number is even or odd using if...else expression
fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    val evenOdd = if (num % 2 == 0) "even" else "odd"

    println("$num is $evenOdd")
}