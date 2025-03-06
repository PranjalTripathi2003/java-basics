/*
Stack is a data structure which follows Last in First Out, that is Jo last mein gaya , vo pehle bahar aayega.
*/

import java.util.Stack;

public class MyStackForList {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // Stack by default uses the one and only way it is implemented that is using
        // the "List" interface.

        // To push an element inside of a Stack, we use the push() function.
        animals.push("Lion");
        animals.push("Wolf");
        animals.push("Bull");
        System.out.println(animals);

        // To check what element is at the top of the stack we use peek() function
        System.out.println(animals.peek());

        // To remove an element from the stack, which would be top of the stack ofc, we
        // use the pop() functon
        System.out.println(animals.pop());
        System.out.println(animals);
    }
}
