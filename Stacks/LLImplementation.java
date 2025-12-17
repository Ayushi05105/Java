package Stacks;

import Stacks.ImplementationArray.Stack;

public class LLImplementation {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.println(h.val+" ");
        }
        void display(){
            displayrec(head);
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(0);
        st.display();
    }
    
}
