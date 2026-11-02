package note

import menu.Menu
import menu.MenuItem

class NoteView(
    private val note: Note
) {

    private val menu = Menu("Что дальше?") { buildMenuItems() }

    fun show() {
        println()
        println("Заметка: ${note.title}")
        println(note.text)
        menu.show()
    }

    private fun buildMenuItems(): List<MenuItem> = listOf(
        MenuItem("Назад") { menu.close() }
    )
}
