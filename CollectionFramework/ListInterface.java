package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterface {

    public static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));  // 1-based indexing
        l.set(1,10); // modify at index i
        System.out.println(l);
        System.out.println(l.contains(10));//true
    }
     public static void LinkedListExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));  // 1-based indexing
        l.set(1,10); // modify at index i
        System.out.println(l);
        System.out.println(l.contains(10));//true
    }

    public static void StackExamples(){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);       //1 2 3
        System.out.println(st.pop()); //3
        System.out.println(st.peek());//2
        System.out.println(st.size());//2
        System.out.println(st.empty()); //false
    }


    public static void main(String[] args) {
       // ArrayListExamples();
        //LinkedListExamples();
        StackExamples();
    }
    
}
