import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    print("Enter your choice : \n 1. Addition \n 2. Multiplication \n 3. Division \n 4. Substraction ")
    var ch = reader.nextInt()

    print("Num 1 : ")
    var num1 = reader.nextInt()
    print("Num2 : ")
    var num2 = reader.nextInt()
    print("Num3 : ")
    var num3 = reader.nextInt()

    if(ch==1)
    {
        var result = num1+num2+num3
        print("Addition of $num1, $num2, $num3 is $result")
    }
    else if(ch==2)
    {
        var result = num1*num2*num3
        print("Multiplication of $num1, $num2, $num3 is $result")
    }
    if(ch==3)
    {
        var result = num1/num2
        print("Division of $num1, $num2 is $result")
    }
    if(ch==4)
    {
        var result = num1-num2-num3
        print("Substraction of $num1, $num2, $num3 is $result")
    }
}