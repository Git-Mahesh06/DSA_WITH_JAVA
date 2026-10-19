class LinkedList {
    public static class Node {
        public int data;
        public Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
        this.head = null;
    }

    public Node search(int key) {
        Node p = this.head, q = null;
        while (p != null) {
            if(p.data == key) {
                if(p != this.head) {
                    q.next = p.next;
                    p.next = this.head;
                    this.head = p;
                    return p;
                }
            }
            q = p;
            p = p.next;
        }
        return null;
    }
    public int delete(int index) {
        int val = 0;
        if(index == 0) {
            val = head.data;
            head = head.next;
        } else {
            Node p = this.head;
            for(int i = 0 ; p != null && i < index - 1; i++) {
                p = p.next;
            }
            if(p != null) {
                Node t = p.next; //the node to be deleted
                val = t.data;
                p.next = t.next;

            }
        }
        return val;
    }

    // Method to add a new node at the end of the list
    public void insert(int index, int val) {
        if(index == 0) {
            Node t = new Node(val);
            t.next = head;
            this.head = t;
        } else {
            Node p = this.head;
            for(int i = 0 ; p != null && i < index - 1; i++) {
                p = p.next;
            }

            if(p != null) {
                Node t = new Node(val);
                t.next = p.next;
                p.next = t;
            }

        }
    }

    public void display() {
        Node current = head; // Start from the head of the list
        while (current != null) {
            System.out.print(current.data + " "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line at the end
    }
}

public class LinkedListtest {

    public static void main(String[] args) {
        // Create a sample linked list
        int[] A = {8, 6, 3, 9, 4};
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < A.length; i++) {
            linkedList.insert(i, A[i]);
        }

        linkedList.display();

    }
}