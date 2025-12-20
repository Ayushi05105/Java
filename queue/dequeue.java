package queue;

import java.util.LinkedList;
import java.util.Deque;

public class dequeue {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.add(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.add(5);
        System.out.println(dq);
        // dq.removeAll(dq);
        // System.out.println(dq);
        //dq.removeLastOccurrence(dq);
        //ystem.out.println(dq);
    }
    
}
