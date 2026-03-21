package basic.TripillarAssignment.Module13;
public class StackUsingArray {
    int top = -1;
    int[] arr = new int[5];

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.display();
    }

    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

