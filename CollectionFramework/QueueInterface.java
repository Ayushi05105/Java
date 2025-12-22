package CollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterface {

    static void priorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(7);
        pq.add(9);
        System.out.println(pq);
        System.out.println(pq.peek());
    }

    static void QueueExample(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        System.out.println(q.size());


    }

    public static void main(String[] args) {
       // QueueExample();
       priorityQueueExample();
    }
    
}
