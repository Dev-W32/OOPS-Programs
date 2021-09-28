package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

class PreAssgn<T extends Number>{
    int length;
}

public class LowerBoundGenerics {


    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li);
        System.out.println("Average: ");

    }


}
