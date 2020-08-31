package ru.url.cutter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Link {
    @Id
    @GeneratedValue
    private Long id;
    private String text;

    public Link() {
    }

    public Link(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
