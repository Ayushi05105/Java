package LinkedList;
//there is a ll A0,A1,A2,A3,....An
//output: A0,An,A1,An-1,....
public class test {

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void reorderList(Node head){
        if(head == null || head.next == null) return;
        //finding mid
        // slow is middle
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse from mid
        Node prev = null;
        Node curr = slow.next;
        slow.next = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = temp;
        }
        //merge
        Node f1 = head;
        Node f2 = prev;
        while(f2 != null){
            Node t1 = f1.next;
            Node t2 = f2.next;
            f1.next = f2;
            f2.next = t1;
            f1= t1;
            f2 = t2;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        reorderList(a);
        display(a);
    }
    
}
