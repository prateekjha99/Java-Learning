package collections.list;

import java.util.LinkedList;

public class LearnLinkedList {

    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();

        lst.add("mango");
        lst.add("apple");
        lst.add(1, "orange");       // O(N)
        lst.addFirst("banana");
        lst.addLast("four");

        lst.get(3);                  // O(N)
        lst.indexOf("orange");       // O(N)

        // queue methods
        lst.offer("strawberry");      // O(1) : insert at the end
        lst.offerFirst("watermelon");
        lst.offerLast("muskmelon");

        lst.poll();                     // retrieves and removes head
        lst.pollFirst();
        lst.pollLast();

        lst.peek();                     // only retrieves head

        // stack methods
        lst.push("pineapple");

        lst.pop();

        System.out.println(lst);
    }
}
