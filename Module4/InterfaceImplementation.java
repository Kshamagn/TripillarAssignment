package basic.TripillarAssignment.Module4;
public interface InterfaceImplementation {
    public static void main(StringImmutableDemo[] args){
        interface Vehicle{
            void start();
        }
        class Car implements Vehicle{
            public void start() {
                System.out.println("Car is starting...");
            }
        }
        Car mycar = new Car();
        mycar.start();
    }
}
