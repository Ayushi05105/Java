package Stacks;
import java.util.Stack;

public class basic {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(3);
        st.push(9);
        st.push(14);
        System.out.println(st);
        System.out.println("Size is: "+st.size());
    }
    
}
