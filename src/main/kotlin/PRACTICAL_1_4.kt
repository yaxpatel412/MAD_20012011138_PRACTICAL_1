fun main(){

    print("Enter Month number : ")
    val number = readLine()
    val Number_input = when (number)
    {
        "1" -> "January"
        "2" -> "February"
        "3" -> "March"
        "4" -> "April"
        "5" -> "May"
        "6" -> "June"
        "7" -> "July"
        "8" -> "August"
        "9" -> "September"
        "10" -> "Octomber"
        "11" -> "November"
        "12" -> "December"
        else -> "Invalid Month"
    }

    println(Number_input)

}