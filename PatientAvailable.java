package com.example.Week4;

//Thursday, 17 July 2025
public class PatientAvailable {
//    Thursday, 17 July 2025
    private String patient;
    private int present;

    public PatientAvailable(String patient, int present) {
        this.patient = patient;
        this.present = present;
    }

    public PatientAvailable() {

    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public boolean availablePatient () {
        return present > 0;
    }

    public void inTreatment() {
        if (! availablePatient()){
            throw new IllegalStateException("There is no patient at the moment. ");
        }
        present --;
    }

    public void notInTreatment() {
        present ++;
    }

    @Override
    public String toString() {
        return "PatientAvailable{" +
                "patient='" + patient + '\'' +
                ", present=" + present +
                '}';
    }
}
