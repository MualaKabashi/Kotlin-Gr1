package classes

class BankInformation(var name:String, var cardNumber:Long, var isValid: Boolean, var amount:Double) {

    init {
        if (!isValid){
            invalidCard()
        }else{
            getInformation()

        }
    }


    fun getInformation(){
        println("YOUR INFO: $name, $cardNumber. $isValid, $amount")
    }

    fun invalidCard(){
        println("Invalid card")
    }
}