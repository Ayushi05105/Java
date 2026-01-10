package Revision.LinkedList;

public class merge {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp !=null){
        System.out.print(temp.data+ " ");
        temp = temp.next;
    }
}

    public static Node MergeLL(Node list1,Node list2){
        Node head = new Node(100);
        Node t1 = list1;
        Node t2 = list2;
        Node temp = head;
        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null){
            temp.next= t2;
        }
        else {
            temp.next = t1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        Node x = new Node(1);
        Node y = new Node(3);
        Node z = new Node(6);
        Node w = new Node(9);
        x.next = y;
        y.next = z;
        z.next = w;
        Node res = MergeLL(a, x);
        display(res);
    }
    
}
