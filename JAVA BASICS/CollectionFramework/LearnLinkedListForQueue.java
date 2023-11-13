import java.util.LinkedList;
import java.util.Queue;

/*
- We know that a class can implement multiple interfaces

- Ex. Class A implements interface1, interface2 ... etc

- By this we can acheive multiple inheritence (well sorta)

- The collection framework has multiple interfaces List , Set , Queue

- The List interface alone is present in multiple classes such as ArrayList, LinkedList, Stack etc.

- The queue interface is also present in the Linked List class

- For now we will only study it for the Queue interface.

- A Queue follows the concept of FIFO. That is we insert the element from rear side, and it gets out from the front side.

*/
public class LearnLinkedListForQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        // Here we will implement LinkedList<>() using the queue interface

        // LinkedList class now has all the methods that are present inside of the interface queue.
        // To insert elements in a queue , we use the offer function.
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        // To remove and return the FIFO element we use the poll() method
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());

        // To know which element if going to be removed using poll is peek();
        System.out.println(queue.peek());

        // We can also use the "add" function if we want to add an element to the queue, the only difference between offer and add is that if add is not able to add an element in the queue , it throws an exception.
        queue.add(5);
        System.out.println(queue);

        // element()  function can also be used instead of peek, but if the queue is empty , it throws an exception.

        // remove() can be used instead of poll(), but the only catch is, you guessed it... IT THROWS AN EXCEPTION.






    }
}
