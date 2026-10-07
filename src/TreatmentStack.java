public class TreatmentStack {
    private class Node {
        Treatment treatment;
        Node next;

        Node(Treatment treatment) {
            this.treatment = treatment;
            this.next = null;
        }
    }

    private Node top;

    public TreatmentStack() {
        top = null;
    }

    public void push(Treatment treatment) {
        Node newNode = new Node(treatment);
        newNode.next = top;
        top = newNode;

        System.out.println("Patient added to treatment stack.");
    }


    public Treatment pop() {
        if (top == null) {
            System.out.println("Treatment history is empty");
            return null;
        } else {
            Treatment treatment = top.treatment;
            top = top.next;
            System.out.println("Patient removed from treatment stack.");
            return treatment;
        }
    }

    public void displayStack() {
        if (top == null) {
            System.out.println("Treatment history is empty.");
            return;
        }
        Node current = top;
        System.out.println("Treatment History");
        while (current != null) {
            System.out.println(current.treatment);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
