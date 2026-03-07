package basic.TripillarAssignment.Module4;
public class GarbageCollectionDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected");
    }
    public static void main(String[] args){
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
        obj1 = null;
        obj2 = null;
        System.out.println("Requesting Garbage Collection...");
        System.gc();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
}
