package archive

import note.Note

class Archive(
    val name: String
) {
    val notes = mutableListOf<Note>()
}
