// Tree Set defines the property of Set , as well as uses Binary Search Tree, which means all the elements will be unique and in sorted form. We will get it in ascending order.

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // O(logn)

        // Adding elements
        set.add(10);
        set.add(4);
        set.add(9);
        set.add(43);

        // Because of hashing that is going inside the set all of them will be printed out in a random order, hashing is used for security reasons.

        //Set creates a hash of each element, that hash is then given to the collection framework

        // Each element will have an unique hash.
        System.out.println(set);


        // To remove an element from the Hash Set
        set.remove(43);
        System.out.println(set);

        // To check whether an element is present or not we will use contains() methods

        System.out.println(set.contains(333)); // Returns a boolean value
        System.out.println(set);

        // To check whether the set is empty or not
        System.out.println(set.isEmpty());

        // To check the size of a Set
        System.out.println(set.size());

        // To remove all of the elements
        set.clear();
        System.out.println(set);
    }
}
