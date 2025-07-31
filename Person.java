package com.example.Week4;

//Thursday, 17 July 2025
public class Person {
//    Thursday, 17 July 2025
    protected String name;
    protected PersonRole role;

    public Person(String name, PersonRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonRole getRole() {
        return role;
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }
//
//    public static void availablePatient(){
//        System.out.println("good");
//    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }


}
