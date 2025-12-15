package LinkedList;


public class basicCLL {

    public static void displayCLL(Node head){
        Node temp = head.next;
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


     public static void removehead(Node head){
        Node temp = head.next;
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node{
        Node next;
        int data;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(65);
        Node d = new Node(23);
        Node e = new Node(99);
        Node f = new Node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a;
        displayCLL(a);

        
    }
    
}
