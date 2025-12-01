package LinkedList;


public class TwinSum {

    public static int TwinSumEvenLL(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        int maxSum =0;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2 != null){
            int sum = p1.data + p2.data;
            if(maxSum < sum) maxSum = sum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
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

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(99);
        Node f = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        System.out.println(TwinSumEvenLL(a));

    }

}
