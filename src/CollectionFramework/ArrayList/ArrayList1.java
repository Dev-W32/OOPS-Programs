package CollectionFramework.ArrayList;
import java.util.*;
// much more flexible than array

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple"); // Adding object in arraylist
        list.add("Mango");
        list.add("Grapes");
        list.add("Kiwi");
        System.out.println(list);   // no need of for loop

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }


        // Traversing List through iterator
        // iterator is an interface
    /*    Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Print element and move to next
            System.out.println("traversing list through for-each loop");

            for (String fruit : list) {
                System.out.println(fruit);
                list.set(1,"Dates");
            }

        }   */

    }
}