package basic.TripillarAssignment.Module12;
public class LinkedListInsertBeginning {
    static Node head;

    public static void main(String[] args) {
        insert(30);
        insert(20);
        insert(10);

        display();
    }

    static void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

