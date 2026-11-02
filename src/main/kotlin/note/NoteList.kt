package note

import menu.Menu
import menu.MenuItem

class NoteList(
    private val archiveName: String,
    private val notes: MutableList<Note>
) {

    private val menu = Menu("Список заметок архива «$archiveName»:") { buildMenuItems() }

    fun show() {
        menu.show()
    }

    private fun buildMenuItems(): List<MenuItem> {
        val items = mutableListOf<MenuItem>()
        items.add(MenuItem("Создать заметку") { NoteCreate(notes).show() })
        notes.forEach { note ->
            items.add(MenuItem(note.title) { NoteView(note).show() })
        }
        items.add(MenuItem("Назад") { menu.close() })
        return items
    }
}
