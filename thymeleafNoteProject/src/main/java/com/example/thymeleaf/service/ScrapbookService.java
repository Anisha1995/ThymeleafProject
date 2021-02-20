package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScrapbookService {
    private List<Note> notes = new ArrayList<>();

    public List<Note> save(Note note){
        notes.add(note);
        return notes;
    }
}
