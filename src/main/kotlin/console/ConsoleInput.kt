package console

import java.util.Scanner

object ConsoleInput {

    private val scanner = Scanner(System.`in`)

    fun readText(): String = scanner.nextLine().trim()

    fun readNonEmptyText(
        prompt: String,
        errorMessage: String
    ): String {
        while (true) {
            println(prompt)
            val value = readText()
            if (value.isNotEmpty()) return value
            println(errorMessage)
        }
    }
}
