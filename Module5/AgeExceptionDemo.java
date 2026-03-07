package basic.TripillarAssignment.Module5;
class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}
public class AgeExceptionDemo {
    static void checkAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("You are not elligeble to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(16);
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
