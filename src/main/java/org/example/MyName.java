package org.example;

public class MyName {
    private String name;
    private String lastname;

    public MyName() {

    }

    public MyName(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}