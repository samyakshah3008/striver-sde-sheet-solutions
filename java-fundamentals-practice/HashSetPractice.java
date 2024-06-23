import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet<Integer> myHash = new HashSet<>(6, 0.5f);
        myHash.add(5);
        myHash.add(10);
        myHash.add(12);
        myHash.add(13);
        System.out.println(myHash);
    }

}
