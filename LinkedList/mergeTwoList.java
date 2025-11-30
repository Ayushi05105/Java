package LinkedList;
public class mergeTwoList {

    public static Node mergeSortedList(Node list1,Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(100);
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.val<temp2.val){
                Node a = new Node(temp1.val);
                temp.next = a;
                temp =a;
                temp1=temp1.next;
            }
            else{
                Node a = new Node(temp2.val);
                temp.next = a;
                temp =a;
                temp2=temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head.next;
    }

    public static void displayLL(Node head){
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
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(78);
        a.next = b;
        b.next = c;
        c.next = d;
        Node x = new Node(3);
        Node y = new Node(6);
        Node z = new Node(9);
        x.next = y;
        y.next = z;
        Node m = mergeSortedList(a, x);
        displayLL(m);
    }
}
