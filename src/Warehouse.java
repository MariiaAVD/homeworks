package com.ifmo.task.exs6;

import java.util.Arrays;

public class Warehouse {
    private Book[] book;
    private int number;

    void setNumber(String number){
        if (number == null) {
            throw new IllegalArgumentException("Значение number 0");
        }
        this.number = number;
    }

    public void addBook(Book book){
        Objects.requireNonNull(book, "book не может быть null");
        for (int i = 0; i < 20; i++) {
            if (book[i] == null) {
                book[i] = book;
                return;
}

    @Override
    public String toString() {
        return "Warehouse{" +
                "book=" + Arrays.toString(book) +
                ", number=" + number +
                '}';
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    public void setNumber(int number) {
        this.number = number;
    }