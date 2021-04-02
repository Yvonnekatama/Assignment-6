fun main(){
var gari=Car("Subaru","legacy","white",14)
    gari.carry(14)
   gari.identity()
    println(gari.calculateParkingFees(5))

    var bus=Bus("citi hoppa","benz","green",54)
      println(bus.maxTripFare(50.20))
    println(bus.calculateParkingFees(7))
}


 open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }
    fun identity(){
     println("I am a $color $make $model")
    }
  open fun calculateParkingFees(hours:Int):Int{
    var parkingfees=hours*20
    return parkingfees
}

}
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var maxfare=fare*capacity
        return maxfare
    }

    override fun calculateParkingFees(hours:Int):Int{
        var busparkingfees=hours*capacity
        return busparkingfees
    }
}