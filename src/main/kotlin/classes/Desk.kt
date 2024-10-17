package classes

//class Desk(material:String, width:Int) {
//    var material:String = material
//    var width: Int = width
//
//
//    fun deskInformation(){
//        println("This desk is $material and has $width width")
//    }
//}

class Desk(var material: String, var width: Int) {

    fun deskInformation(){
        println("This desk is $material and has $width width")
    }

    init {
        if (width<200){
            println("We need a larger desk!")
        }
        else{
            println("Good choice!")
        }
    }
}





