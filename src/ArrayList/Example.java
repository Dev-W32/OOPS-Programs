package ArrayList;

import java.util.ArrayList;

class ExampleGeneric<X,Y>{  // Instead of string and int we wrote X and Y
   X x;
   Y y;
   ExampleGeneric(X x,Y y)
   {
       this.x=x;
       this.y=y;
       System.out.println(x);
       System.out.println(y);
   }
}


 class ExampleArrayListandGeneric {
    public static void main(String[] args) {
        // ArrayList Example
       ArrayList fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add(23);
        fruits.add(34.6);
        ArrayList vegetables = new ArrayList();
        vegetables.add("Cauliflower");
        System.out.println(fruits.addAll(vegetables));  // Adding elements of 1 list to another
        System.out.println(fruits.get(1));  // getting element by specifying an index
        System.out.println(fruits.set(0,"Banana")); // Replacing an element at index
        fruits.remove(2);   // Removing the element present at index
        ArrayList<String> toRemove = new ArrayList();   // Created a new arraylist
        toRemove.add("Apple");  // Added an elemetn which needs to be removed
        fruits.removeAll(toRemove); // just like venn diagram A-B we removed the parts of list which was included in toRemove as well as fruits
        System.out.println(fruits);
        System.out.println(fruits.size());  // just like .length in array
        System.out.println(fruits.contains("Guava"));   // boolean value
        System.out.println(fruits.contains("Banana"));
        // Passing arraylist elements to array
        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);

        for (int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }

        fruits.clear();     // clears all the elements at once
        System.out.println(fruits.isEmpty());




        ExampleGeneric<String, Integer> p1 = new ExampleGeneric("Devesh",19);
        ExampleGeneric<Double, Integer> p2 = new ExampleGeneric(3.14,19);

        System.out.println(p1.x+"\t"+p1.y);
        System.out.println(p2.x+"\t"+p2.y);


    }
}


