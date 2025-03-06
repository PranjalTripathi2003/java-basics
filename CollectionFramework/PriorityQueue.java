import java.util.Comparator;
import java.util.PriorityQueue;

// By default the priority of an element getting removed in priority queue is that of the SMALLEST element that is present inside of the priority queue. Becuase priority queue by default implements MIN HEAP.
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Converts the default MIN HEAP to MAX HEAP
        /*
               ↑
        - Here we have written "PriortyQueue" as a class instead of queue because becuase as the name suggests it in itself is a queue with some priority given to a particular element.

        - Even if we replace "PriorityQueue" with "Queue" it would not throw any error.

        - We can use the functions of the queue interface.

        - Written to avoid confusion from the implementation of queue in Linked List.
         */
        pq.offer(50);
        pq.offer(67);
        pq.offer(49);
        pq.offer(84);
        System.out.println(pq);
//        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        // To change the priority , we add a "COMPARATOR" in the default constructor of Priority Queue above

        // !! Min and if the priority changed Max Heap is only concerned about the smallest/biggest element, it wont be in ascending or descending order, only the first element is set accoriding to Min Heap Or Max Heap , the order after that is random set by the Heap.
    }

}
