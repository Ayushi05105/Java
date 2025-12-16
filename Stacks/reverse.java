package Stacks;

import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(7);
        st.push(9);
        System.out.println(st);
        
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack<Integer> qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println(qt);

        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }
    
}
