package LinkedList;


public class llCycle {

    public static void displayLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node IndexCyclicll(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return null;
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean CyclicLL(Node head){
        if(head == null) return false;
        if(head.next == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
           // if(slow == null) return false;
            slow = slow.next;
           // if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        Node e = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = b;
        //displayLL(a);
        System.out.println(CyclicLL(a));
        Node m = IndexCyclicll(a);
        System.out.println(m.data);
    }
    
}
