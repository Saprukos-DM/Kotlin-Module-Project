package menu

import console.ConsoleInput

class Menu(
    private val header: String,
    private val buildItems: () -> List<MenuItem>
) {

    private var isOpen = true

    fun close() {
        isOpen = false
    }

    fun show() {
        isOpen = true
        while (isOpen) {
            val items = buildItems()
            println()
            println(header)
            items.forEachIndexed { index, item ->
                println("$index. ${item.title}")
            }
            val input = ConsoleInput.readText()
            val choice = input.toIntOrNull()
            when {
                choice == null -> println("Нужно ввести цифру — номер пункта меню.")
                choice !in items.indices -> println("Пункта с номером $choice здесь нет. Выберите номер из списка.")
                else -> items[choice].onSelect()
            }
        }
    }
}
