package Revision.LinkedList;

public class MaxTwinSum {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

     public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static int MaxTwin(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next= reverse(slow.next);
        int max = 0;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2 != null){
            int sum = p1.data + p2.data;
            if(sum > max) max = sum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
        display(a);
        System.out.println(MaxTwin(a));
    }
    
}
