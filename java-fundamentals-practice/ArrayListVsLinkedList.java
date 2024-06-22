import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> li2 = new LinkedList<>();

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

        li.addLast(100);
        li.addLast(200);
        li.addFirst(2992);

        // li.clear();
        // System.out.println(li.size());
        System.out.println(li.contains(1));
        // System.out.println(li.indexOf(159)); // -1 since element is not present

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}
