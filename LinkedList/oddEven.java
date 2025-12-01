package LinkedList;

public class oddEven {

    // odd index then even index
//Input: head = [2,1,3,5,6,4,7]
//Output: [2,3,6,7,1,5,4]

public static Node oddeven(Node head){
    Node odd = new Node(0);
    Node even = new Node(0);
    Node tempo = odd;
    Node tempe = even;
    Node temp = head;
    while(temp != null){
        tempo.next = temp;
        temp = temp.next;
        tempo = tempo.next;

        tempe.next = temp;
        if(temp == null) break;
        temp = temp.next;
        tempe = tempe.next;
    }
    odd = odd.next;
    even = even.next;
    tempo.next = even;
    return odd;
}



public static void displayLL(Node head){
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data+ " ");
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
        displayLL(a);
        Node m = oddeven(a);
        displayLL(m);
}
    
}
