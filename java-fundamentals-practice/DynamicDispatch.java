class One {
    public void hello() {
        System.out.println("hello there! ");
    }

    public void name() {
        System.out.println("name");
    }
}

class Two extends One {
    public void hello2() {
        System.out.println("hello there! 2 ");
    }

    public void name() {
        System.out.println("name 2");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        // One obj = new One();
        // Two obj2 = new Two();

        One obj = new Two();
        obj.name();
        // Two obj = new One(); // not possible
        try {

        } catch (ArithmeticException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (Exception e) {

        }
    }

}
