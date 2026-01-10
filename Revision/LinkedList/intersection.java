package Revision.LinkedList;

public class intersection {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int size(Node head){
            int count = 0;
            while(head != null){
                count++;
                head = head.next;
            }
            return count;
        }
 
    public static Node IntersectionOf2LL(Node list1 , Node list2){
        int l1 = size(list1);
        int l2 = size(list2);
        Node tempA = list1;
        Node tempB = list2;
        if(l1 > l2){
            int step = l1 - l2;
            for(int i=0;i<step;i++){
            tempA = tempA.next;
            }
        }else{
            int step = l2 - l1;
            for(int i =0;i<step;i++){
            tempB=tempB.next;
        }
    }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(90);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node x = new Node(90);
        Node y = new Node(4);
        x.next = y;
        y.next = b;
        Node p = IntersectionOf2LL(a, x);
        System.out.println((p.data));
    }
    
}
