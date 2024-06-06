/*
-Inside of Sets, duplicate elements are not allowed

- Sets mainly consist of HashSet, LinkedHashSet, TreeSet
*/
import java.util.HashSet;
import java.util.Set;
public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // Instead of writing "Set<Integer>" we can also write "HashSet<Integer>" since HashSet belongs to Set only, but that will be more work, we have seen this type of syntax in priority queue also.

        // Adding elements
        set.add(10);
        set.add(43);
        set.add(333);
        set.add(432);

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
