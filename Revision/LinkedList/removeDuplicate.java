package Revision.LinkedList;

public class removeDuplicate {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void RemoveDuplicate(Node head){
        if(head == null) return;
        Node temp = head;
        while(temp.next != null){
        if(temp.data==temp.next.data){
            temp.next = temp.next.next;
        }else{
            temp = temp.next;
        }
    }
}

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(4);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        display(a);
        RemoveDuplicate(a);
        display(a);

    }
    
}
