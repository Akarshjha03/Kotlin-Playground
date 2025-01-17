// Data class to represent coffee details
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main() {
    // Creating a CoffeeDetails object for AKARSH
    val coffeeforAJ = CoffeeDetails(sugarCount = 2, name = "AKARSH", size = "XXL", creamAmount = 20)

    // Making coffee using the CoffeeDetails object
    makecoffee(coffeeforAJ)
}

// Function to make coffee based on the CoffeeDetails object
fun makecoffee(order: CoffeeDetails) {
    if (order.sugarCount < 0) {
        println("Choice is not available")
    } else if (order.sugarCount < 2) {
        println("Coffee with ${order.sugarCount} spoon of sugar for ${order.name}")
    } else {
        println("Coffee with ${order.sugarCount} spoons of sugar for ${order.name}")
    }

    // Printing additional details about the coffee order
    println("Size: ${order.size}, Cream Amount: ${order.creamAmount}ml")
}
