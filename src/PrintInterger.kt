import java.util.*

//How to Print an Integer entered by an user in Kotlin using Scanner

//fun main() {
//
//    val reader = Scanner(System.`in`)
//    println("Enter Integer value")
//    val IntegerValue = reader.nextInt()
//    println("Enter value is $IntegerValue")
//
//}

//Example: Find ASCII value of a character

//fun main() {
//
//    val c = 'a'
//    val ascii = c.toInt()
//
//    println("The ASCII value of $c is: $ascii")
//}
//Example: Compute Quotient and Remainder
fun main(args: Array<String>) {

    val dividend = 25
    val divisor = 4

    val quotient = dividend / divisor
    val remainder = dividend % divisor

    println("Quotient = $quotient")
    println("Remainder = $remainder")
}