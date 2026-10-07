public class Main {

    public static void main(String[] args) {

        PatientBST patientBST = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();

       

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

        patientBST.insert(patient1);
        patientBST.insert(patient2);
        patientBST.insert(patient3);

        System.out.println("PATIENT RECORDS");
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
        }



        System.out.println(" REMAINING PATIENTS ");

        emergencyQueue.displayQueue();
    }
}