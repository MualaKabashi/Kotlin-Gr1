package singleton

object DatabaseConnection {
    init {
        println("Database connection created!")
    }

    fun executeQuery(query:String){
        println("Executing $query")
    }
}


fun main() {
    var dbConnection = DatabaseConnection
    var dbConnection2 = DatabaseConnection

    dbConnection.executeQuery("SELECT * FROM users")
    dbConnection2.executeQuery("DELETE FROM users WHERE id=2")

    println(dbConnection===dbConnection2)

}