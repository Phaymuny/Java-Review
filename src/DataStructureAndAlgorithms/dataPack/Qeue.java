package DataStructureAndAlgorithms.dataPack;

import java.util.LinkedList;
import java.util.Queue;

public class Qeue {
    public static void main(String[] args) {
        //Queue = Fifo data structure. First in First out
        //        A collection designed for holding elements prior to processing linear data structure.
        //

        //enqueue = add an object from the tail.
        //dequeue = remove an object from the head.
        //add = enqueue, offer()
        //remove = dequeue, poll()
        //*****************************************

        Queue<String> queue = new LinkedList<>();
        //Queue inherint everything from collection that mean you can use everything from collection to queue.
        System.out.println(queue.isEmpty());
        queue.offer("Karen");
        queue.offer("chart");
        queue.offer("steve");
        queue.offer("Holord");
        //peek will use to see the element in front of the line.
        //System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.contains("Karen"));
        queue.poll();
        System.out.println(queue);
    }
}
