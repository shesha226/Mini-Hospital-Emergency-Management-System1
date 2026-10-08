public class VisitLinkedList {
    private class Node {
        Visit visit;
        Node next;

        Node(Visit visit) {
            this.visit = visit;
            this.next = null;
        }
    }
    
    private Node head;

    public VisitLinkedList() {
        this.head = null;
    }

    public void addVisit(Visit visit) {
        Node newNode = new Node(visit);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        System.out.println("Patient visit added successfully");
    }

    public Visit removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visits to remove.");
            return null;
        }

        if (head.visit.getVisitId() == visitId) {
            Visit removedVisit = head.visit;
            head = head.next;
            return removedVisit;
        }

        Node current = head;
        while (current.next != null && current.next.visit.getVisitId() != visitId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Visit not found.");
            return null;
        }

        Visit removedVisit = current.next.visit;
        current.next = current.next.next;
        return removedVisit;
    }
    
    public Visit searchVisit(int visitId) {
        Node current = head;
        while (current != null) {
            if (current.visit.getVisitId() == visitId) {
                return current.visit;
            }
            current = current.next;
        }
        System.out.println("Visit not found.");
        return null;
    }

    public void displayVisits() {
        if (head == null) {
            System.out.println("No visits to display.");
            return;
        }
        System.out.println("Patient Visits:");
        Node current = head;
        while (current != null) {
            System.out.println(current.visit);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
