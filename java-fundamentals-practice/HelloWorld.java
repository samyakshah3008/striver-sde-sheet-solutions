class A extends Thread {
    public void run() {
        System.out.println("Hello");
    }

    public void run(int a) {
        System.out.println("Hii");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}