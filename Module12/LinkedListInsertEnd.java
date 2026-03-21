package basic.TripillarAssignment.Module12;
public class LinkedListInsertEnd {
    static Node head;

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        display();
    }

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
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
