package LinkedList;


public class basic3DLL {

    public static void deleteAtHead(Node head){
        head = head.next;
        head.prev = null;
    }

    public static void displayLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node{
        Node next;
        int val;
        Node prev;
        Node(int val){
            this.val= val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(12);
        Node c = new Node(24);
        Node d = new Node(45);
        Node e = new Node(8);
        Node f = new Node(4);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        displayLL(a);
        deleteAtHead(a);
        displayLL(a);


    }
    
}
