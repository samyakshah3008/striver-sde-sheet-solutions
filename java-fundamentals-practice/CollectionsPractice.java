import java.util.ArrayList;

public class CollectionsPractice {
    public static void main(String[] args) {
        // Set
        // TreeSet
        ArrayList<Integer> li = new ArrayList<>(5);
        ArrayList<Integer> li2 = new ArrayList<>(5);

        li2.add(11);
        li2.add(12);
        li2.add(13);
        li2.add(14);
        li2.add(15);

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        li.add(0, 1);
        li.addAll(0, li2);

        // li.clear();
        // System.out.println(li.size());
        System.out.println(li.contains(1));
        // System.out.println(li.indexOf(159)); // -1 since element is not present

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}