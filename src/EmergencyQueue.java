public class EmergencyQueue {

    private class Node {
        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(Patient patient) {

        Node newNode = new Node(patient);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Patient added to emergency queue.");
    }

    public Patient dequeue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = front.patient;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }

    // Display all waiting patients
    public void displayQueue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        Node current = front;

        System.out.println("EMERGENCY WAITING QUEUE");

        while (current != null) {
            System.out.println(current.patient);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }
}