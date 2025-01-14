
// Define the Person class
class Person(val name: String, val age: Int)
fun main() {
    val person = Person("Alice", 30)
    val person2 = Person("Jake", 560)

    // Print the person's details
    println("Name: ${person.name}, Age: ${person.age}")
    println("Name: ${person2.name}, Age: ${person2.age}")
}