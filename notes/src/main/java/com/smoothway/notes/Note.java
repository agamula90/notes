package com.smoothway.notes;

import java.util.Date;

public class Note {
    private String text;
    private Date date;

    Note(String text, long time) {
        this.text = text;
        this.date = new Date(time);
    }

    public String getText() {
        return text;
    }
}
