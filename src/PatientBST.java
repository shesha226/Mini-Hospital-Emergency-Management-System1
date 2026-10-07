public class PatientBST {
    private class Node {
        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node root;

    public PatientBST() {
        this.root = null;
    }

    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private Node insertRec(Node current, Patient patient) {
        if (current == null) {
            return new Node(patient);
        }
        if (patient.getPatientId() < current.patient.getPatientId()) {
            current.left = insertRec(current.left, patient);
        } else if (patient.getPatientId() > current.patient.getPatientId()) {
            current.right = insertRec(current.right, patient);
        } else {
            // Duplicate patientId, do not insert
            System.out.println("Patient with ID " + patient.getPatientId() + " already exists.");
        }
        return current;

    }
    
    public Patient search(int patientId) {

        Node result = searchRecursive(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }
    
    private Node searchRecursive(Node current, int patientId) {
        if (current == null) {
            return null;
        }
        if (patientId == current.patient.getPatientId()) {
            return current;
        }

        if (patientId < current.patient.getPatientId()) {
            return searchRecursive(current.left, patientId);
        } else {
            return searchRecursive(current.right, patientId);
        }
    }
    
    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    private Node deleteRec(Node current, int patientId) {
        if (current == null) {
            return null;
        }
        if (patientId < current.patient.getPatientId()) {
            current.left =deleteRec(current.left, patientId);
            
        }   
        else if(patientId >current.patient.getPatientId()) {
            current.right = deleteRec(current.right, patientId);
        } else {
            if (current.left == null && current.right == null) {
                return null; 
            } else if (current.left == null) {
                return current.right; 
            } else if (current.right == null) {
                return current.left; 
            } else {
                Node successor = findMin(current.right);
                current.patient = successor.patient; 
                current.right = deleteRec(current.right, successor.patient.getPatientId()); 
            }
        }
        return current;
    }

    private Node findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;

    }

    public void displayInOrder() {
        if (root == null) {
            System.out.println("No patients found");
        }
        inOrder(root);
    }

    private void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.println(current.patient);
            inOrder(current.right);
        }
    }
}