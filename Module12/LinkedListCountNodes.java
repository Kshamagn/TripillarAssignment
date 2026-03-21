package basic.TripillarAssignment.Module12;
public class LinkedListCountNodes {
    static Node head;

    public static void main(String[] args) {
        insert(30);
        insert(20);
        insert(10);

        System.out.println("Total nodes: " + count());
    }

    static void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static int count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

