package com.ifmo.task.exs6;

public class Book {
    private String name;
    private Author author;
    private int page;
    private int age;


    void setName (String name){
        if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException("Значение name < 2");
        }
        this.name = name;
    }

    void setAuthor(String Name){
        if (author == null || author.trim().length() < 3) {
            throw new IllegalArgumentException("Значение fullName < 3");
        }
        this.author = author;
    }

    void setPage(int page) {
        if (age < 10) {
            throw new IllegalArgumentException("Значение page < 10");
        }
        this.age = age;
    }

    void setAge(int age) {
        if (age > 2021) {
            throw new IllegalArgumentException("Значение age > 2021");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", age=" + age +
                '}';
    }
}
