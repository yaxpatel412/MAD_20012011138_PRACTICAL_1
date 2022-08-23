class Car(type:String, model:String, owner:String, miles:Int, price:Int, cprice:Int){
    var ty:String = type
    var mo =model
    var ow = owner
    var m:Int = miles
    var p:Int = price
    var cp:Int = cprice

    fun getCarPrice(){
        println("Car Information: $ty , $mo\nCar Owner: $ow\nMiles Driven: $m\nOriginal Car Price: $p, \nCurrent Car Price: $cp ")
    }
}
fun main() {
    var cars = arrayOf(Car("BMW","2018","Aman",105,100000, 98950),
        Car("BMW","2019","Karan",20,400000, 399800),
        Car("Toyota","2017","KJS",100,1080000, 1079000),
        Car("Maruti", "2020", "NPP", 200, 4000000, 3998000))
    println("Creating Car Class Object car1 in next line")
    println("Object of class is created and Init is called.\n")
    for (i in cars){
        i.getCarPrice()
        print("----------------------\n----------------------\n")
    }

}