abstract class Parent {
    void logic() {
        System.out.println("logic");
    }

    abstract public void greet();
}

class Child2 extends Parent {
    @Override
    public void greet() {
        System.out.println("Helllooo");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Parent obj = new Parent()
    }
}
