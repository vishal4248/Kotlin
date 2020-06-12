package bot

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    greet("Mic", "2020")
    remindName()
    guessAge()
    count()
    test()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    println("So, Please enter a number ")
    val num = scanner.nextInt()
    for (i in 0..num) {
        println("$i!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To reverse a number.")
    println("3. To interrupt the execution of a program and Quit.")
    check()
}

fun end() {
    println("Thank You!")
    println("Congratulations, have a nice day!")
}

fun check() {
    val number = scanner.nextInt()
    when {
        number == 1 -> {
            println("Nice, Enter your statement ")
            val statement = readLine()!!
            println("Enter which no. of times you want to repeat this statement")
            val times = scanner.nextInt()
            repeat(times) {
                println(statement)
            }
            end()
        }

        number == 2 -> {
            println("Nice, Enter the number ")
            var num = scanner.nextInt()
            var reversed = 0
            while(num > 0) {
                val digit = num % 10
                reversed = reversed * 10 + digit
                num /= 10
            }

            println("Your reversed number is ${reversed}")
            end()
        }

        number ==3 -> {
            end()
        }
    }

}
