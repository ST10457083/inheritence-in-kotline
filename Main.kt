open class Person(
    var firstName: String,
    var lastName: String
) {
    // Method to return full name
    open fun getName(): String {
        return "$firstName $lastName"
    }
}

// Employee class inherits from Person
class Employee(
    firstName: String,
    lastName: String,
    var employeeId: Int,
    var department: String
) : Person(firstName, lastName) {

    // Override method from Person
    override fun getName(): String {
        return "Employee: ${super.getName()}"
    }
}

// Main function
fun main() {
    val employee = Employee("Moshito", "Petja", 101, "IT")

    println("Name: ${employee.getName()}")
    println("Employee ID: ${employee.employeeId}")
    println("Department: ${employee.department}")
}
