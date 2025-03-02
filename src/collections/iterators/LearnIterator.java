package collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnIterator {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Mango", "Banana", "Kiwi", "Orange", "Apple" ));

        System.out.println(fruits);

        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // remove Kiwi

        /**
        for(String fruit: fruits) {
            if("Kiwi".equals(fruit)) {
                fruits.remove(fruit);   // Exception in thread "main" java.util.ConcurrentModificationException
            }
        }
         */

        it = fruits.iterator();
        while(it.hasNext()) {
            if("Kiwi".equals(it.next())) {
                it.remove();
            }
        }
        System.out.println(fruits);   // [Mango, Banana, Orange, Apple]


        // Second type of iterator - java.util.ListIterator - supports both fw/bck direction with next and previous methods
        ListIterator<String>lit = fruits.listIterator();
        while(lit.hasNext()) {
            System.out.println(lit.next());
        }

        while (lit.hasPrevious()) {
            if ("Orange".equals(lit.previous())) {
                lit.add("Kiwi");
            }
        }
        System.out.println(fruits);   // [Mango, Banana, Kiwi, Orange, Apple]


        /**
         * 	1. Java.util
         * 	2. Two types of iterators - Iterator and ListIterator
         * 	3. Why to use iterator when we have enhanced for loops ? - with iterator we can remove the element while traversing wheras for and foreach will throw exception
         *
         * Methods
         * 	1. Collection.iterator( )
         * 	2. Iterator.hasNext( )
         * 	3. Iterator.next( )
         * 	4. Iterator.remove( )
         * 	5. ListIterator.add( )
         * 	6. ListIterator.set( )
         * 	7. ListIterator.hasPrevious( )
         * 	8. ListIterator.previous( )
         * 	9. Next(Int cursorPos)  / previous(Int cursorPos)
         *
         *
         * Iterator vs ListIterator
         * 	1. An Iterator is fwd only, but ListIterator supports both directions
         * To modify collection, ListIterator provides two more methods add( ) and set () along with Iterator's remove( )
         * */
    }
}
