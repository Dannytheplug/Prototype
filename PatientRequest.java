package com.example.Week4;

//Thursday, 17 July 2025
public class PatientRequest {
//    Thursday, 17 July 2025
    private Person person;
    private String typeOfPatient;
    private long timeAdmitted;

    public PatientRequest(Person person, String typeOfPatient) {
        this.person = person;
        this.typeOfPatient = typeOfPatient;
        this.timeAdmitted = timeAdmitted;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTypeOfPatient() {
        return typeOfPatient;
    }

    public void setTypeOfPatient(String typeOfPatient) {
        this.typeOfPatient = typeOfPatient;
    }

    public long getTimeAdmitted() {
        return timeAdmitted;
    }

    public void setTimeAdmitted(long timeAdmitted) {
        this.timeAdmitted = timeAdmitted;
    }

    @Override
    public String toString() {
        return "PatientRequest{" +
                "person=" + person +
                ", typeOfPatient='" + typeOfPatient + '\'' +
                ", timeAdmitted=" + timeAdmitted +
                '}';
    }
}
