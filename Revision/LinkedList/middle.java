package Revision.LinkedList;

public class middle {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node deleteMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next.next !=null && fast.next.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next= slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
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
        Node res = findMiddle(a);
        display(res);
        System.out.println();
        Node res1 = deleteMiddle(a);
        display(res1);
        
    }
    
}
