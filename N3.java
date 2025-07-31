package com.example.Week1;

public class N3 {
    private String name;
    private String role;
    private int age;
    private String branch;

    public N3(String name, String role, int age, String branch) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.branch = branch;
    }

    public N3() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "N3{" +
                "name = '" + name + '\'' +
                ", role = '" + role + '\'' +
                ", age = '" + age + '\'' +
                ", branch = '" + branch + '\'' +
                '}';
    }

    public static void main(String[] args) {
        N3 staff1 = new N3();
        staff1.setName("Mr. Philip");
        staff1.setRole("IT Support");
        staff1.setAge(19);
        staff1.setBranch("Surulere");
        System.out.println(staff1);

        N3 staff2 = new N3();
        staff2.name = " Miss Ese";
        staff2.role = " Manager";
        staff2.age = 9;
        staff2.branch = " Surulere";
        System.out.println(staff2);

        N3 staff3 = new N3();
        staff3.name = " Mr. Idirs";
        staff3.role = " Instructor";
        staff3.age = 23;
        staff3.branch = " Surulere";
        System.out.println(staff3);

        N3 staff4 = new N3();
        staff4.name = " Miss Violet";
        staff4.role = " Human Resource";
        staff4.age = 12;
        staff4.branch = " Surulere";
        System.out.println(staff4);
    }
}
