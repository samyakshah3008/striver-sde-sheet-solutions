class MyThreadRunn1 implements Runnable {
    public void run() {
        System.out.println("I am thread 1 ");
    }
}

class MyThreadRunn2 implements Runnable {

    public void run() {
        System.out.println("I am threasd 2 ");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyThreadRunn1 bullet1 = new MyThreadRunn1();
        MyThreadRunn2 bullet2 = new MyThreadRunn2();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
