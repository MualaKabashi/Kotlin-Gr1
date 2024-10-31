package interfaces

interface Vehicle {
    fun start()
    fun stop()
    var brand: String
    var productionYear: Int
}

interface ElectricVehicle {
    fun charge()
    var batteryLevel: Int
}


class Tesla : Vehicle, ElectricVehicle {
    override var batteryLevel: Int = 25

    override var brand: String = "Tesla"

    override var productionYear: Int = 2024

    override fun charge() {
        println("CHARGING...")
    }

    override fun start() {
        println("the vehicle is started")
    }

    override fun stop() {
        println("the vehicle stopped")
    }
}

fun main() {
    var tesla = Tesla()

    tesla.brand = "Tesla new version"
    println("${tesla.batteryLevel}%")
    tesla.charge()
    tesla.batteryLevel = 100
    println("${tesla.batteryLevel}%")
}
