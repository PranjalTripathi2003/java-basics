// Arrays class extends the functionality of PRIMITIVE ARRAYS (not ArrayList)
// It contains a for binary search inside an array using the binarySearch() function
// BinarySearch always works on a sorted Array.

import java.util.Arrays;

public class MyArraysClass {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 23, 21, 1233, 123123, 7, 8, 9, 10 };
        /*
         * int index = Arrays.binarySearch(numbers,4); // Does a binary search on the
         * array, and returns its index
         * System.out.println("Index of the element 4 is: " + index);
         */
        // To sort out an array, we use the sort function
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
