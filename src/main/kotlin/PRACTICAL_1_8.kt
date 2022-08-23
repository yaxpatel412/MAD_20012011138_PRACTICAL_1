import java.util.*
fun main() {
    println("-------200012011138_Yax Patel-------")
    val arr = arrayOf(4, 3, 2, 1)
    println("Create Array-1 by using array0f() method:")
    println(Arrays.toString(arr))

    val arr1 = arrayOf<Int>(2,1,3,4)
    println("Create Array-2 by using array<>() method:")
    println(Arrays.toString(arr1))

    val arr2= Array(8){i->i}
    println("Create Array-3 by using array<>() and lamda function:")
    println(Arrays.toString(arr2))

    val arr3 = intArrayOf(1,2,3,4)
    println("Create Array-4 by using intarray(): ")
    println(Arrays.toString(arr3))

    val arr4 = arrayOf<Int>(0,0,0,0)
    println("Create Array-5 by using intarrayOf():")
    println(arr4.contentToString())

    val ar1 = arrayOf(1,3)
    val ar2= intArrayOf(4,5)
    val ar3 = intArrayOf(6,7)
    val lala = arrayOf(ar1,ar2,ar3)
    println("Create 2D array by using array0f() and IntarrayOf(): ")
    println(Arrays.deepToString(lala))

    var arrayint = Array<Int>(5){0}
    var x:Int = 0
    val abc:Int = arrayint.size
    while( x < abc)
    {
        print("a[$x]=")
        arrayint[x] = readLine()!!.toInt()
        x++
    }
    println("Entered Array: ")
    for (y in arrayint)
        print("$y  ")
    println("")

    println("Sorted by using inbuilt Function: ")
    arrayint.sort()
    for (z in arrayint)
        print("$z  ")
    println("")

    println("Sorted by NOT using inbuilt Function: ")
    var temp:Int
    for (i in arrayint.indices) {
        for (j in i + 1 until arrayint.size) {
            if (arrayint[i] > arrayint[j]) {
                temp = arrayint[i]
                arrayint[i] = arrayint[j]
                arrayint[j] = temp
            }
        }
    }
    println(Arrays.toString(arrayint))



}