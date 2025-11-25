package LinkedList;

import Sorting.stringSort;

public class basicll {

    public static void displayrec(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayrec(head.next);
    }
    public static void display(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    //for reverse print of the list
    public static void func(Node head){
        if(head == null) return;
        func(head.next);
        System.out.print(head.data + " ");
    }

    public static int length(Node head){
        int count =0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(13);
        Node d = new Node(45);
        Node e = new Node(78);
        Node f = new Node(98);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // System.out.println(a.next.next.next.next.next.data);

       // Node temp = a;

        // for(int i=1;i<=6;i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // while(temp != null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        display(a);
        System.out.println();
        displayrec(a);
        System.out.println();
        func(a);
        System.out.println();
        System.out.println(length(a));

    }
    
}
