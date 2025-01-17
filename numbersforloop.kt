fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6)
    for (index in 0 until numbers.size) {
        numbers[index] = numbers[index] * 2 // Multiply each element by 2
    }
    println(numbers) // Output the updated list
}
