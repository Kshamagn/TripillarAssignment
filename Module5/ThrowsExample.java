package basic.TripillarAssignment.Module5;

public class ThrowsExample {
    static void divide() throws ArithmeticException{
        int result = 10 / 0;
        System.out.println(result);
    }
    public static void main(String[] args){
        try{
            divide();
        }catch(ArithmeticException e){
            System.out.println("Exception handled using throws ");
        }
    }
}
