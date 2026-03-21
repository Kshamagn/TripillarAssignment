package basic.TripillarAssignment.Module13;
import java.util.Stack;

public class ReverseStackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + temp);
    }
}
