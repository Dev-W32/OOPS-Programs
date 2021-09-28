package Tutorials;

// Usually used to iterate over arrays and arraylist

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Are you listening");

        for(String item: list )  // here item ka data type should be compatible with the arraylist datatype
        {   // Syntax: for(datatype_of_arraylist_or_array   var_name    :   Arraylist_name/Array_name)
            System.out.print(item+ " ");
        }
    }
}
