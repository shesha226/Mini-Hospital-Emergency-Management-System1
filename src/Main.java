public class Main {

    public static void main(String[] args) {

        PatientBST patientBST = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        TreatmentStack treatmentStack = new TreatmentStack();
        VisitLinkedList visitLinkedList = new VisitLinkedList();

       

        Patient patient1 = new Patient(
                1,
                "Kamal Sadakalum",
                "123 Main St",
                "0772234567",
                "KamalSandaklum@gmail.com",
                25,
                "Asthma"
        );

        Patient patient2 = new Patient(
                2,
                "Nimal Perera",
                "456 Lake Road",
                "0751234567",
                "nimal@example.com",
                35,
                "Fever"
        );

        Patient patient3 = new Patient(
                3,
                "Amal Fernando",
                "789 Main Road",
                "0719876543",
                "amal@example.com",
                45,
                "Chest Pain"
        );

        
        System.out.println("PATIENT RECORDS");

        patientBST.insert(patient1);
        patientBST.insert(patient2);
        patientBST.insert(patient3);

        patientBST.displayInOrder();


       

        System.out.println(" EMERGENCY PATIENTS");

        emergencyQueue.enqueue(patient1);
        emergencyQueue.enqueue(patient2);
        emergencyQueue.enqueue(patient3);

        emergencyQueue.displayQueue();


      

        System.out.println("TREAT NEXT PATIENT ");

        Patient nextPatient = emergencyQueue.dequeue();

if (nextPatient != null) {

    System.out.println("Patient selected for treatment:");
    System.out.println(nextPatient);

    Treatment treatment = new Treatment(
            1,
            nextPatient.getPatientId(),
            "2026-10-07",
            "Dr. Perera",
            nextPatient.getMedicalCondition(),
            "Medication and observation"
    );

    treatmentStack.push(treatment);
}


        System.out.println(" REMAINING PATIENTS ");

        emergencyQueue.displayQueue();

        System.out.println(" VISIT RECORDS ");
        treatmentStack.displayStack();

        System.out.println(" ADDING VISIT RECORDS ");
        Visit visit1 = new Visit(
                1,
                "2026-10-07",
                "10:30 AM",
                "Dr. Perera",
                "Medication and observation"
        );

        Visit visit2 = new Visit(
                2,
                "2026-10-07",
                "11:00 AM",
                "Dr. Perera",
                "Medication and observation"
        );

        Visit visit3 = new Visit(
                3,
                "2026-10-07",
                "11:30 AM",
                "Dr. Perera",
                "Medication and observation"
        );

        visitLinkedList.addVisit(visit1);
        visitLinkedList.addVisit(visit2);
        visitLinkedList.addVisit(visit3);

        visitLinkedList.displayVisits();

        System.out.println(" SEARCHING VISIT RECORDS ");

        Visit FoundVisit = visitLinkedList.searchVisit(2);
        if (FoundVisit != null) {
            System.out.println("Visit found: " + FoundVisit);
    } else {
            System.out.println("Visit not found.");
    }
        
    System.out.println("REMOVING VISIT RECORDS");
    Visit removedVisit = visitLinkedList.removeVisit(1);
    if (removedVisit != null) {
        System.out.println("Visit removed: " + removedVisit);
    } else {
        System.out.println("Visit not found.");
    }

    System.out.println(" UPDATED VISIT RECORDS ");
    visitLinkedList.displayVisits();
    }
}