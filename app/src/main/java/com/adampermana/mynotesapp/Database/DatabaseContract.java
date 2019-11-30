package com.adampermana.mynotesapp.Database;

import android.provider.BaseColumns;

public class DatabaseContract {
    static final class NoteColumns implements BaseColumns {
        static final String TABLE_NAME = "note";
        static final String TITLE = "title";
        static final String DESCRIPTION = "description";
        static final String DATE = "date";
    }
}
