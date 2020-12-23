package ru.osipov.my_todo_list_application.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ru.osipov.my_todo_list_application.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
