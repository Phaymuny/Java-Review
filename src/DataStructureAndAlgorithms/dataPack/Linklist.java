package DataStructureAndAlgorithms.dataPack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        /*
        //LinkedList = store Nodes in 2 parts (data + address)
        //             Nodes are in non-consecutive memory locations
        //             Elements are linked using pointers


        //advantage of linkedlist :
        // 1. Dynamic data structure (allocate needed memory while running).
        // 2. Insertion and Deletion of Node is easy .0(1)
        // 3. No/Low memory waste.

        // disadvantage :
        // Greater memory usage (additional pointer)
        // No random access of element (no index[i])
        // Accessing/searching elements is more time consuming. 0(n)

        //uses ?
        // implement Stacks/Queues
        // GPS navigation
        // music playlist  n
        */

        LinkedList<String> linkedList = new LinkedList<String>();

        //we can treat Linkedlist as stack and queue like below:
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();
        linkedList.add(4,"E");

        //linkedlist is easy to insert and delete than arraylist.
        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String firsCha = linkedList.removeFirst();
        String lastCha = linkedList.removeLast();
        System.out.println(firsCha);
        System.out.println(lastCha);
        System.out.println(linkedList);

        ArrayList arrayList = new ArrayList<>(); 
        arrayList.add("ad"); 
        arrayList.add("FF");
        System.out.println(arrayList);
        System.out.println("Time in millisecord : "+System.currentTimeMillis());
    }
}
