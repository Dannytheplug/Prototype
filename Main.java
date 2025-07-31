package com.example.Week2;

public class Main{

    public static void main(String[] args) {

        Day1 dd= () -> System.out.println("Yo!");

        print(dd);
//        print(
//                () -> {
//                    System.out.println("Yo yo yo!");
//                }
//            }
//        );

//        Animal animal = new Animal();
//        animal.day();
//        print(animal);
    }

    static void print(Day1 d){
        d.day();
    }
}
