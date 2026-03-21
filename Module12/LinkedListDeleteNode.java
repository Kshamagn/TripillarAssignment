package basic.TripillarAssignment.Module12;
public class LinkedListDeleteNode {
    static Node head;

    public static void main(String[] args) {
        insert(30);
        insert(20);
        insert(10);

        delete(20);
        display();
    }

    static void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

