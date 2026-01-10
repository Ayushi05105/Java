package Revision.LinkedList;


public class oddevenLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
           // this.next = null;
        }
    }

    public static void display(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
}

    public static Node evenodd(Node head){
        Node temp = head;
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempO = odd;
        Node tempE = even;
        while(temp != null){
            if(temp.data % 2 != 0){
            tempO.next = temp;
            temp = temp.next;
            tempO = tempO.next;
            }else{
            tempE.next = temp;
            temp = temp.next;
            tempE = tempE.next;
            }
        }
        tempE.next = null;
        tempO.next = even;
        return odd.next;
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
        Node res = evenodd(a);
        display(res);

    }
       
}
