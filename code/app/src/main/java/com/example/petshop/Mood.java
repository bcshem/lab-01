package com.example.petshop;

import java.util.Date;


public abstract class Mood {
    private Date date;

    // CONSTRUCTOR 1 - TAKES DATE ARG
    public Mood(Date date) {
        this.date = date;
    }

    // CONSTRUCTOR 2 - TAKES NO ARG
    public Mood() {
        this.date = new Date();
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String express();
}
