package basic.TripillarAssignment.Module5;
class LifeThread extends Thread{
    public void run() {
        System.out.println("Thread is running");
    }
}
public class ThreadLifeCycleDemo {
    public static void main(String[] args){
        LifeThread t1 = new LifeThread();
        System.out.println("Thread Stage: " + t1.getState());
        t1.start();
        System.out.println("Thread State after start : " + t1 .getState());
    }
}
