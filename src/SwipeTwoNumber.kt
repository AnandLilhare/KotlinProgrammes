//Example 1: Swap two numbers using temporary variable

//fun main(args: Array<String>) {
//
//    var first = 1.20f
//    var second = 2.45f
//
//    println("--Before swap--")
//    println("First number = $first")
//    println("Second number = $second")
//
//    // Value of first is assigned to temporary
//    val temporary = first
//
//    // Value of second is assigned to first
//    first = second
//
//    // Value of temporary (which contains the initial value of first) is assigned to second
//    second = temporary
//
//    println("--After swap--")
//    println("First number = $first")
//    println("Second number = $second")
//}

//Swap two numbers without using temporary variable

fun main(args: Array<String>) {

    var first = 12
    var second = 24

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    first = first - second
    second = first + second
    first = second - first     

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}