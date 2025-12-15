package LinkedList;

public class palindromeDLL {

    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean palindrome(Node head){
         Node temp = head;
         while(temp.next != null){
            temp = temp.next;
         }
         while(head != temp){
            if(head.val != temp.val) return false;
            head = head.next;
            temp = temp.prev;
         }
         return true;
    }

    public static class Node{
        Node next;
        Node prev;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
         Node a = new Node(3);
        Node b = new Node(12);
        Node c = new Node(24);
        Node d = new Node(24);
        Node e = new Node(12);
        Node f = new Node(3);
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
        System.out.println(palindrome(a));
    }
}
