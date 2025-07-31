package com.example.Week4;

//Thursday, 17 July 2025
public class Patient extends Person{
//    Thursday, 17 July 2025
    protected int urgency;

    public Patient(String name, int urgency) {
        super(name, PersonRole.Patient);
        this.urgency = urgency;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "urgency=" + urgency +
                '}';
    }
}
