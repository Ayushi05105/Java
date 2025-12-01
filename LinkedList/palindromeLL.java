package LinkedList;


public class palindromeLL {

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

    public static boolean palindrome(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2 != null){
            if(p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
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
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(3);
        Node f = new Node(4);
        Node g = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        displayLL(a);
        System.out.println(palindrome(a));


    }
    
}
