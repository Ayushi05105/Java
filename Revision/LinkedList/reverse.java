package Revision.LinkedList;

public class reverse {

    public static class Node{
        int data;
        Node next;
        Node(int data){
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

    public static Node ReverseRec(Node head){
        if(head == null || head.next == null) return head;
        Node temp = ReverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static Node Reverse(Node head){
        Node curr = head;
        Node after = null;
        Node prev = null;
        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }


    public static void main(String[] args) {
         Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        // Node res = Reverse(a);
        // display(res);
        Node m = ReverseRec(a);
        display(m);
        
    }
    
}
