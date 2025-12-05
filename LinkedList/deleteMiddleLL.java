package LinkedList;

public class deleteMiddleLL {

    public static Node deleteLL(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next == null) return null;
        slow.next = slow.next.next;
        return head;
    }

    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void displayLL(Node head){
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(3);
        Node d = new Node(90);
        Node e = new Node(8);
        Node f = new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayLL(a);
        System.out.println(deleteLL(a));
    }
    
}
