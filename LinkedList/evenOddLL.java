package LinkedList;
// odd value then even value

public class evenOddLL {

    public static Node evenOdd(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;
        Node tempO = new Node(0);  
        Node tempE = new Node(0);
        Node Odd = tempE ;
        Node Even = tempO;
        while(temp != null){
            Node next = temp.next;
            if(temp.data %2 ==0){
                Even.next = temp;
                Even = Even.next;
            }
            else{
                
                Odd.next = temp;
                Odd = Odd.next;
            }
            temp.next = null;
           temp = next;
            
        }
        Odd.next = tempO.next;
        Even.next = null;
        return tempE.next;
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
       // displayLL(a);
        Node m = evenOdd(a);
        displayLL(m);

    }
    
}
