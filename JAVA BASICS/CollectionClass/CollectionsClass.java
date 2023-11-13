// Like the collections frameworks that contains multiple interfaces of Data Structures that we can directly use and extend the functionality of Java, we have collections Class too

// These classes are used with collections frameworks to increase the speed of our workflow without creating those functions again by ourseleves for a particular collection frameword

// Below we have used ArrayList with the collection class of finding min and max element from the list , without creating an loop by ourselves.

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(97);

        System.out.println("Min element is: " + Collections.min(list));
        System.out.println("Max element is: " + Collections.max(list));

        System.out.println(Collections.frequency(list, 97)); // Tells us the frequency how many times an element  appears.

        
    }
}
