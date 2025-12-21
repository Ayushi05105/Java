package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);              //1 2 3 4 5
    Stack<Integer> st = new Stack<>();  
    int k = 3;
    for(int i =0;i<k;i++){
        st.push(q.remove());
    }
    System.out.println(st);           //1 2 3
    while(st.size()>0){
        q.add(st.pop());
    }
    System.out.println(q);            //4 5 3 2 1
    // for(int i =0;i<q.size();i++){
    //     q.add(q.remove());
    // }
    // System.out.println(q);
    for(int i =0;i<q.size()-k;i++){
        q.add(q.remove());
    }
    System.out.println(q);            //3 2 1 4 5
  }    
    
}
