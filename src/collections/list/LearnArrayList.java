package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>(List.of("one", "two", "three"));
        System.out.println(lst);    // [one, two, three]

        lst.add("four");               // [one, two, three, four]
        lst.remove(2);           // returns "three" and new array is [one, two, four]
        lst.set(1, "five");            // [one, five, four]
        lst.get(2);
        lst.contains("five");          // true
        lst.indexOf("five");           // 2
        lst.remove("five");
        lst.clear();                   // []
        lst.isEmpty();                 // true
        System.out.println(lst);


        // sort
        lst = new ArrayList<>(List.of("one", "two", "three"));  // new copy
        lst.sort(Comparator.naturalOrder());              // [one, three, two]
        lst.sort(Comparator.reverseOrder());              // [two, three, one]

        // List.of() is Immutable
        List<Integer> lst2 = List.of(1, 9, 12);
        // lst2.set(0, 6);    // Results in exception ImmutableCollections$AbstractImmutableList.set

    }
}
