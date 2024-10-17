package classes



class Laptop {
    var name: String = ""
    var speed : Int = 0
    var strength: Double = 0.0

    fun giveInformation(){
        println("My computer info: $name, $speed, $strength")
    }

    constructor(name:String , speed:Int, strength: Double){
        this.name = "Macbook M2 Pro"
        this.speed= speed
        this.strength = strength
    }

    constructor(){

    }



}