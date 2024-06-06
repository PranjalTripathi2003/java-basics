class myThread1 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("Thread one is running absolutely fine.");
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("Thread two is running absolutely fine.");
        }
    }
}

public class multithreading_thread_class {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start(); // The run method is already defined inside the Thread class of Java that we are extending , it is able to automatically call the run method that we have overidden from the default

    }
}
