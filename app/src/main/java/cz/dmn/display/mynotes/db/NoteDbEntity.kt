package cz.dmn.display.mynotes.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteDbEntity(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    val serverId: Long,
    val text: String,
    val dirty: Boolean = false,
    val deleted: Boolean = false
)