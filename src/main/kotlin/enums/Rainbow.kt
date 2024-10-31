package enums

//enum class Rainbow {
//    RED,
//    PURPLE,
//    GREEN,
//    BLUE,
//    YELLOW,
//    INDIGO
//}

enum class Rainbow(var value: Int) {
    RED(1),
    PURPLE(2),
    GREEN(2),
    BLUE(3),
    YELLOW(4),
    INDIGO(5);

    fun printColor(){
        println("$value")
    }
}


enum class TrafficLight(var message:String){
    RED("WAIT"),
    ORANGE("GET READY!"),
    GREEN("GOOOO!")
}

fun main() {
    var red = Rainbow.RED
    var red1 = Rainbow.RED.name
    var red2 = Rainbow.RED.printColor()
    var red3 = Rainbow.PURPLE.printColor()

    println(red.printColor())
    println(red1)

    for (color in Rainbow.values()){
        println(color)
    }

    var trafficLight = TrafficLight.GREEN
    var trafficLight1 = TrafficLight.RED
    println(trafficLight.message)
    println(trafficLight1.message)











}