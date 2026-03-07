package basic.TripillarAssignment.Module5;

public class TryCatchFinallyDemo {
    public static void main(String[] args){
        try{
            int num = 20 / 0;
        }catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
        finally{
            System.out.println("finally block always executes");
        }
    }

}
