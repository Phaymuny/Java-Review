package DataStructureAndAlgorithms.dataPack;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

    // Priority Queue = A FIFO data Structure that serves elements
    // with the highest priorities first
    // before elements with lower priority

    // it like queue but we sort the element first it will display from small to big
    public static void main(String[] args) {

        /*Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("D");
        queue.offer("C");
        queue.offer("B");
        queue.add("TITI");
        queue.offer("E");

        System.out.println(queue);
        System.out.println(queue.peek());*/

        /*while (!queue.isEmpty()) {
            // System.out.println(queue.poll());

        }*/

        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Peeking the head element of the queue
        String head = queue.peek();
        System.out.println("Head of the queue: " + head); // Prints: Head of the queue: First

        // The queue remains unchanged after peeking
        System.out.println("Queue after peek: " + queue); // Prints: Queue after peek: [First, Second, Third]
        
    }
}
