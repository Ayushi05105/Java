package Revision.LinkedList;

public class removingNthLast {
    public static Node removingNthNode(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i =0;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
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
        Node res = removingNthNode(a,3);
        display(res);   
    }
    
}
