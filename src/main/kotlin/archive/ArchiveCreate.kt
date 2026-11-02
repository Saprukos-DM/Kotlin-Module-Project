package archive

import console.ConsoleInput

class ArchiveCreate(
    private val archives: MutableList<Archive>
) {

    fun show() {
        println()
        println("Создание архива.")
        val name = ConsoleInput.readNonEmptyText(
            "Введите название архива:",
            "Название архива не может быть пустым."
        )
        archives.add(Archive(name))
        println("Архив «$name» создан.")
    }
}
