package archive

import menu.Menu
import menu.MenuItem
import note.NoteList

class ArchiveList {

    private val archives = mutableListOf<Archive>()

    private val menu = Menu("Список архивов:") { buildMenuItems() }

    fun show() {
        menu.show()
    }

    private fun buildMenuItems(): List<MenuItem> {
        val items = mutableListOf<MenuItem>()
        items.add(MenuItem("Создать архив") { ArchiveCreate(archives).show() })
        archives.forEach { archive ->
            items.add(MenuItem(archive.name) { NoteList(archive.name, archive.notes).show() })
        }
        items.add(MenuItem("Выход") { menu.close() })
        return items
    }
}
