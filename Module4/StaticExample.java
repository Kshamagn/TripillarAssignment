package basic.TripillarAssignment.Module4;
public class StaticExample {
        static int count = 0;
        StaticExample() {
            count ++;
        }
        static void display() {
            System.out.println("Number of objects created: " + count);
        }

            public static void main (String[] args) {
                StaticExample obj1 = new StaticExample();
                StaticExample obj2 = new StaticExample();
                StaticExample obj3 = new StaticExample();
                StaticExample.display();
            }

}
