package com.devi.mynotesapp;

import com.devi.mynotesapp.entiity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
