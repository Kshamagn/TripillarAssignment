package basic.TripillarAssignment.Module13;
public class QueueUsingArray {
    int front = 0, rear = -1;
    int[] arr = new int[5];

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
        q.display();
    }

    void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Full");
            return;
        }
        arr[++rear] = x;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Removed: " + arr[front++]);
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
