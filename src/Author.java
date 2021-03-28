package com.ifmo.task.exs6;

public class Author {
    private String firstname;
    private String lastname;


    void setFirstname(String firstname){
        if (firstname == null || firstname.trim().length() < 3) {
            throw new IllegalArgumentException("Значение firstname < 3");
        }
        this.firstname = firstname;
}

    void setLastname(String lastname){
        if (lastname == null || lastname.trim().length() < 3) {
            throw new IllegalArgumentException("Значение firstname < 3");
        }
        this.lastname = firstname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }