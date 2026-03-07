package basic.TripillarAssignment.Module4;
final class Animal{
    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class FinalClassDemo {
    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
    }
}
