class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2");
        }
    }
}

public class ThreadConcept {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
        obj1.setPriority(Thread.MAX_PRIORITY);
    }
}