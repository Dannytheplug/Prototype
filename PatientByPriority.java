package com.example.Week4;

import javax.print.Doc;
import java.util.*;

//Thursday, 17 July 2025
public class PatientByPriority {
//    Thursday, 17 July 2025
    private Map<String, Person> patient = new HashMap<>();
    private PriorityQueue<PatientRequest> queue = new PriorityQueue<>(new Comparator<PatientRequest>() {
        @Override
        public int compare(PatientRequest o1, PatientRequest o2) {
            Person p1 = o1.getPerson();
            Person p2 = o2.getPerson();

            if (p1 instanceof Doctor && !(p2 instanceof Doctor)) return -1;
            if (!(p1 instanceof Doctor) && p2 instanceof Doctor) return 1;

            if (p1 instanceof Patient && p2 instanceof Patient){
                return Integer.compare(((Patient) p2).getUrgency(), ((Patient) p1).getUrgency());
            }
            return Long.compare(o1.getTimeAdmitted(), o2.getTimeAdmitted());
        }
    });

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

        if ( person == null || patientAvailable == null || ! patientAvailable.availablePatient())
            return "Patient pbp";
        patientAvailable.inTreatment();
        return request.getPerson().getName() + " attending to " + request.getTypeOfPatient();
    }


}
