package LinkedList;

public class middlell {

    public static Node middleLL(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public static void displayLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(8);
        Node c = new Node(2);
        Node d = new Node(11);
        Node e = new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node m = middleLL(a);
        displayLL(m);
    }
    
}
