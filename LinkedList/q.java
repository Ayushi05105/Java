package LinkedList;

public class q {
    public static class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void insertionAthead(Node head){
        Node temp = head;
        while(temp!=null){
            temp.next = head;
            head = temp;
        }
    }

    public static boolean cycle(Node head){
        Node slow = null;
        Node fast = null;
        if(head == null && head.next==null) return false;
        while(fast!=null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static Node cycleNode(Node head){
        Node slow = null;
        Node fast = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        Node temp = head;
        if(fast == null && fast.next==null) return null;
        while(temp!=slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    public static Node oddEven(Node head){
        Node odd = head;
        Node oddHead = odd;
        Node even = head.next;
        Node evenHead = even;
        while(even!=null &&even.next!=null){
            odd.next= odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next.next;
        }
        odd.next = evenHead;
        return oddHead;
    }
    public static Node removeNthFromEnd(Node head,int n){
        Node temp = new Node(0);
        temp.next = head;
        Node fast = temp;
        Node slow = temp;
        for(int i =1;i<=n+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next!=null) slow.next = slow.next.next;
        return temp;
    }
    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next==null) return null;
        slow.next = slow.next.next;
        return head;
    }
    public static Node mergeTwosortedList(Node head1,Node head2){
        Node t1 = new Node(0);
        Node t2 = new Node(0);
        t1 = head1;
        t2 = head2;
        Node h= new Node(100);
        Node t = h;
        while(t1!= null && t2 !=null){
            if(t1.val<t2.val){
                t1.next = t2;
                t = t1;
                t1 = t1.next;
            }else{
                t2.next = t1;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){
            t.next = t2;
        }
        if(t2 == null){
            t.next = t1;
        }
        return h.next;
    }
}
