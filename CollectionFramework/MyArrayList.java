
/*
*  !!!!!!! ALL OF THESE FUNCTIONS WRITTEN FOR ARRAY LIST ALSO WORK FOR LINKED LIST USING THE LIST INTERFACE.
*
* */
import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        /*
         * // Creating an Array of integer type of length of 5.
         *
         * int[] marks = new int[30];
         * marks[0] = 0;
         * marks[29] = 29;
         * marks[30] = 30; // A normal array throws us "ArrayIndexOutOfBounds"
         * exception, as we cannot increase the size of an array. To solve this problem
         * we use ArrayList.
         */

        // CREATING AN ARRAY LIST

        // We dont set any value in the ArrayList() constructor as the array list is
        // dynamic, that is, it increase the size of array as we go.

        // Size Increased = n + n/2 +1 (if the previous size was n) , by default n = 10.

        // By default an ArrayList creates an Array of size 10.
        ArrayList<Integer> marks = new ArrayList<>(); // The "<>" angled brackets suggest that we are using a class from
                                                      // the collection framework of Java language. It is absolutely not
                                                      // necessery to put, but then it would be a "raw" use of that (raw
                                                      // means without defining any data type)
                                                      // collection class.

        marks.add(1); // Adds an element at the end of an ArrayList
        System.out.println(marks);

        // Overloading the add function and adding an item/element at a specified
        // position.
        marks.add(1, 50); // In Java , Arrays and ArrayList both have 0 base indexing.
        System.out.println(marks);

        // Adding an ArrayList inside of another ArrayLists using addAll function.
        ArrayList<Integer> newMarks = new ArrayList();
        newMarks.add(20);

        marks.addAll(newMarks);
        System.out.println(marks);

        // To fetch/get what value is stored at particular index in the ArrayList, we
        // "get" function with the "." operator.
        System.out.println(marks.get(2));

        // Removal in ArrayList

        // 1. Removing from index
        marks.remove(2);
        System.out.println(marks);

        // 2. Removing the type of element added last, for ex. we want to remove all 50
        // from our ArrayList that was added at last.
        marks.add(2, 50);
        marks.add(2, 50);
        System.out.println(marks);
        // Now removing the extra 50 that we added
        marks.remove(Integer.valueOf(50));
        System.out.println(marks);

        // To remove all the elements present in an List we use the clear function.
        /*
         * marks.clear();
         * System.out.println(marks);
         */

        // Time complexity to do all this O(n)

        // To set a different value at a particular index, we use the set funciton

        marks.set(2, 30);
        System.out.println(marks); // O(1)

        // To check whether the arrlist contains an element
        System.out.println(marks.contains(50)); // O(n) because loop runs.

        // To return the size of the list, not the index, that is how many elements are
        // present inside of that array list.
        System.out.println(marks.size());

        System.out.println("We will return each element in the marks array list one by  one");

        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }

        // Using for each loop
        for (Integer element : marks) {
            System.out.println("The element now is: " + element);
        }

        System.out.println("Using iterator that is present in the collection framework");

        Iterator<Integer> it = marks.iterator(); // Functioning of the "it" iterator is coming from the ArrayList class
                                                 // via its object "marks" that we created. Iterator is an interface.

        while (it.hasNext()) { // hasNext() function present in the Iterator class.
            System.out.println("Iterated element is: " + it.next());
        }

    }

}
