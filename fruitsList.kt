fun main() {
    // Create a mutable list of fruits
    val fruitslist = mutableListOf("Guava", "Pineapple", "Mango", "Orange")
    
    // Print the initial list of fruits
    println(fruitslist)
    
    // Add a new fruit "Strawberry" to the list
    fruitslist.add("Strawberry")
    
    // Print the list after adding "Strawberry"
    println(fruitslist)
    
    // Remove the fruit "Orange" from the list
    fruitslist.remove("Orange")
    
    // Print the list after removing "Orange"
    println(fruitslist)
    
    // Check if the list contains "Strawberry"
    val hasGuava = fruitslist.contains("Guava")
    
    // If the list contains "Strawberry", print a message
    if (hasGuava) {
        println("The list has Guava")
    } else {
        // If "Strawberry" is not in the list, print another message
        println("There's no Guava in the list")
    }
}
