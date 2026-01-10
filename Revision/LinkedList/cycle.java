package Revision.LinkedList;

public class cycle {
     public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static boolean Cycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(5);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e; 
        e.next = c;
        System.out.println(Cycle(a));
    }
    
}
