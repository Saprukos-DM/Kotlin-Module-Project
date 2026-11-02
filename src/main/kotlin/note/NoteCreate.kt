package note

import console.ConsoleInput

class NoteCreate(
    private val notes: MutableList<Note>
) {

    fun show() {
        println()
        println("Создание заметки.")
        val title = ConsoleInput.readNonEmptyText(
            "Введите название заметки:",
            "Название заметки не может быть пустым."
        )
        val text = ConsoleInput.readNonEmptyText(
            "Введите текст заметки:",
            "Текст заметки не может быть пустым."
        )
        notes.add(Note(title, text))
        println("Заметка «$title» создана.")
    }
}
