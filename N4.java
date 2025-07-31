package com.example.Week1;

public class N4 {
    private String name;
    private String role;

    @Override
    public String toString() {
        return "N4{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public N4(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
