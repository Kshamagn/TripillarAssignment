package basic.TripillarAssignment.Module4;
public class AbstractClass {
    public static void main(StringImmutableDemo[] args){
        abstract class Shape{
            abstract void display();
        }
        class Circle extends Shape {

            @Override
            void display() {
                System.out.println("Displaying Circle");
            }
        }
        Circle myCircle = new Circle();
        myCircle.display();
    }

}
