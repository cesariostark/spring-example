package com.deloitte.ownerservice.user;

import java.time.LocalDate;

public class User {

    private Integer id;
    private String name;
    private LocalDate dateBirth;

    public User(Integer id, String name, LocalDate dateBirth) {
        super();
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
