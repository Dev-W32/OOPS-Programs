package CollectionFramework.PracticeAssignment;

import java.util.*;

class JavaIteratorExample {


    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("Nagpur");
        cityNames.add("Mumbai");
        cityNames.add("Pune");
        cityNames.add("Chicago");
        cityNames.add("Houston");

        System.out.println("\n(a)");
        System.out.println("Reading elements using Iterator");
        Iterator<String> iterator1 = cityNames.iterator();
        System.out.println("CityNames elements : ");
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println("\n\n(B)After reversing: ");
        cityNames.sort(Collections.reverseOrder());
        Iterator<String> iterator2 = cityNames.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }


        System.out.println("\n\n(C)");
        Collections.sort(cityNames);
        Iterator<String> iterator3 = cityNames.iterator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }
    }
}