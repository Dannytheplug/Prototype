package com.example.Week4;

import com.example.Week3.LibraryWithoutPriority;
import com.example.Week3.Student;
import com.example.Week3.Teacher;
import com.example.Week3.User;

public class PMain {
    public static void main(String[] args) {
        PatientNotByPriority pnb = new PatientNotByPriority();
        pnb.admittedPatient("Mathematics", 1);

        Person patient = new Patient("Osinachukwu", 100);
        Person doctor = new Doctor("Mr. Ben", PersonRole.Doctor);

        pnb.calledPatient(doctor, "Mr.John");
        pnb.calledPatient(patient, "Kelvin");

        System.out.println(pnb.attendToNextPatient());
        System.out.println(pnb.attendToNextPatient());

//        Wednesday, 16 July 2025
        PatientByPriority pnb1 = new PatientByPriority();
        pnb1.admittedPatient("Java", 1);
        Person patient1 = new Patient("Emma", 100);
        Person doctor1 = new Doctor("Mr. John", PersonRole.Doctor);
        Person emergency = new Patient("David", 400);
        Person vip = new Patient("David", 400);

        pnb1.calledPatient(patient1, "Java");
        pnb1.calledPatient(doctor1, "Java");
        pnb1.calledPatient(emergency, "Java");
        pnb1.calledPatient(vip, "Java");

        System.out.println("\n---Request loading---");

        System.out.println(pnb1.attendToNextPatient());
        System.out.println(pnb1.attendToNextPatient());
        System.out.println(pnb1.attendToNextPatient());
        System.out.println(pnb1.attendToNextPatient());
    }
}
