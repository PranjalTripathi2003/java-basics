import java.util.ArrayDeque;

public class MyArrayDeque {
    // Deque - Stands for doubly ended queue. That means we can remove/add from the
    // front or the rear both. This is used in Sliding Window.

    // We can use the methods of the Queue in Array Deque.
    // First we would create an Object of it.
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(1); // By default, adds the element at the last if offerLast() is not written.
        adq.offer(2);
        adq.offerFirst(12); // This inserts the element at the front of the queue
        adq.offerLast(24); // This inserts the element at the rear of queue.
        System.out.println(adq);

        // To check what elements will be removed from the first and the last of the
        // ArrayDeque
        System.out.println(adq.peek()); // Checks the first element that is to be popped out and gives us its value.
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        // To remove elements from ArrayDeque

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }

}
