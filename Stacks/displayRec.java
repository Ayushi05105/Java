package Stacks;
import java.util.Stack;

public class displayRec {

    public static void displayRevRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevRec(st);
        st.push(top);
    }
    public static void display_Rec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        display_Rec(st);
        System.out.print(top+" ");
        st.push(top);
    }
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(7);
        st.push(9);
       // System.out.println(st);
        displayRevRec(st);
        System.out.println();
        display_Rec(st);
     }
    
}
