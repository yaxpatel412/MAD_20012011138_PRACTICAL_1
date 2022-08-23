fun main() {
    println("------20012011138_Yax Patel---------")
    print("Enter num1:")
    val input1 = readLine()!!
    val a :Float = input1.toFloat()
    print("Enter num2:")
    val input2 = readLine()!!
    val b :Float = input2.toFloat()
    println("---------------------")
    println("$a + $b = "+add(a,b))
    println("$a - $b = "+sub(a,b))
    println("$a * $b = "+mult(a,b))
    println("$a / $b = "+div(a,b))
    println("$a % $b = "+mod(a,b))
    println("---------------------")
}

fun add(num1:Float,num2:Float) :Float
{
    return num1 + num2
}
fun sub(num1:Float,num2:Float) :Float
{
    return num1 - num2
}
fun mult(num1:Float,num2:Float) :Float
{
    return num1 * num2
}
fun div(num1:Float,num2:Float) :Float
{
    return num1 / num2
}
fun mod(num1:Float,num2:Float) :Float
{
    return num1 % num2
}