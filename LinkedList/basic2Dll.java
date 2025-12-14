package LinkedList;

public class basic2Dll {

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        return t;
    }

    public static void insertAtTail(Node head , int x){
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;    
}
    public static void insertAtIdx(Node head,int idx,int x){
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
    }

    public static void insertAtIdx2(Node head,int idx,int x){
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }

        Node r = temp.next;
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        t.next = r;
        r.prev = t;
    }

    public static class Node{
        Node next;
        Node prev;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b = new Node(9);
        Node c = new Node(43);
        Node d = new Node(89);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        display(a);
        Node newNode = insertAtHead(a, 30);
        display(newNode);
        insertAtTail(a, 90);
        display(a);
        //insertAtIdx(a, 3, 45);
        //display(a);
        insertAtIdx2(a, 3, 35);
        display(a);
    }
}
