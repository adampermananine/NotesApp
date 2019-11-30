package com.adampermana.mynotesapp;

import com.adampermana.mynotesapp.Entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
