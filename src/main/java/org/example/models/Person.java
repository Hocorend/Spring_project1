package org.example.models;

import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message ="ФИО не должно быть пустым")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w+", message = "Введите ФИО в формате: Фамилия Имя Отчество")
    private String fullname;

    @Min(value = 1900, message = "Введите реальный год рождения")
    private int year;

    public Person(){}

    public Person(int id, String fullname, int year) {
        this.id = id;
        this.fullname = fullname;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
