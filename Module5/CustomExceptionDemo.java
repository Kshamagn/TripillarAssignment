package basic.TripillarAssignment.Module5;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
    super(message);
    }

}

public class CustomExceptionDemo {

    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is not valid for voting");
            }
            else {
                System.out.println("Eligible to vote");
            }
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}