package com.example.Week4;

import java.util.*;

//Thursday, 17 July 2025
public class PatientNotByPriority {
//    Thursday, 17 July 2025
    private Map<String, Person> patient = new HashMap<>();
    private Queue<PatientRequest> queue = new LinkedList<>();

    public void admittedPatient(String name, int present){
        patient.put(name, new Patient(name, present));
    }

    public void calledPatient(Person person, String name) {
        queue.offer(new PatientRequest(person, name));
    }

    public String attendToNextPatient(){
        if(queue.isEmpty()) return "no patient available";

        PatientRequest request = queue.poll();

        Person person = patient.get(request.getTypeOfPatient());
        PatientAvailable patientAvailable = new PatientAvailable();

        if (patientAvailable == null || ! patientAvailable.availablePatient())
            return "Patient";
        patientAvailable.inTreatment();
        return request.getPerson().getName() + " borrowed " + request.getTypeOfPatient();
    }
}
