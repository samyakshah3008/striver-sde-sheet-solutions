interface hello {
    int a = 45;

    void applyBrakes(int decrement);
}

class Hello2 implements hello {
    public void applyBrakes(int decrement) {
        System.out.println("Applied brakes");
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
