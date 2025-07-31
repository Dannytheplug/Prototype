package com.example.Week3;

public class Student extends User{
    protected int level;

    public Student(String name, int level) {
        super(name, UserRole.Student);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                '}';
    }
}
