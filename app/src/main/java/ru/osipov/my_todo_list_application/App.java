package ru.osipov.my_todo_list_application;

import android.app.Application;

import androidx.room.Room;

import ru.osipov.my_todo_list_application.data.AppDatabase;
import ru.osipov.my_todo_list_application.data.NoteDao;

public class App extends Application {

    private AppDatabase database;
    private NoteDao noteDao;

    @Override
    public void onCreate() {
        super.onCreate();

        database = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();

        noteDao = database.noteDao();
    }

    public AppDatabase getDatabase() {
        return database;
    }

    public void setDatabase(AppDatabase database) {
        this.database = database;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
}
