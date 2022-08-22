import java.util.*

fun main(){

    val reader = Scanner(System.`in`)

    print("Enter Number : ")
    var num = reader.nextInt()

    if(num % 2 == 0)
        println("$num is EVEN")
    else
        println("$num is ODD")


}