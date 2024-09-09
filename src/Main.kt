fun main() {
    val pounds = 150.0
    val kilograms = pounds * 0.453592
    println("1. Convert pounds to kilograms\n$pounds lbs is equal to $kilograms kg\n")

    val miles = 10.0
    val kilometers = miles * 1.60934
    println("2. Convert miles to kilometers\n$miles mi is equal to $kilometers km\n")

    val fahrenheit = 98.6
    val celsius = (fahrenheit - 32) * 5 / 9
    println("3. Convert Fahrenheit to Celsius\n$fahrenheit °F is equal to $celsius °C\n")

    val studentAges = listOf(18, 19, 20, 18, 21, 22, 23, 20, 19, 21)
    val averageAge = studentAges.average()
    println("4. Calculate the average age of 10 students\nStudent ages: $studentAges")
    println("The average age of the students is $averageAge\n")

    val character1 = "Naruto"
    val character2 = "Sasuke"
    val character3 = "Sakura"
    val character4 = "Kakashi"
    val character5 = "Gaara"
    val weapon = "Kunai"
    val ability = "Rasengan"

    println("5. Output a fantasy story")
    val story = """
        In the Hidden Leaf Village, $character1 was training hard to master the $ability.
        He was joined by his trusted friends: $character2, who wielded the Sharingan, $character3, the village's best healer, and $character4, their wise sensei.
        Together, they embarked on a mission to protect the village from invaders. Along the way, they met $character5, the Kazekage, who became their ally.
        With $character1's $weapon and the power of the $ability, the team fought valiantly.
        The bond between $character1, $character2, $character3, $character4, and $character5 grew stronger as they faced the greatest threats to their world.
    """.trimIndent()

    println(story)
}
