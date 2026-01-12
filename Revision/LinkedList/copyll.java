package Revision.LinkedList;

public class copyll {
    public static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data = data;
            this.random=null;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static Node copyRandomList(Node head){
        Node head2= new Node(0);
        Node temp2 =head2;
        Node temp1 = head;
        //creating deep copy
        while(temp1 != null){
            Node temp = new Node(temp1.data);
            temp2.next = temp1;
            temp2 = temp;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;
        //alternating connections
        Node temp = new Node(-1);
        while(temp!=null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
            // assigning random pointers
            while(temp1 != null){
                if(temp1.random ==null) temp2.random = null;
                else temp2.random = temp1.random.next;
                temp1 = temp2.next;
               if(temp1 != null) temp2 = temp1.next;
            }
            temp2 = head2;
            temp1 = head;
            //separating list
            while(temp !=null){
                temp1.next = temp2.next;
                temp1 = temp1.next;
                if(temp1 == null) break;
                temp2.next = temp1.next;
                if(temp2.next ==null) break;
                temp2 = temp2.next;
            }
            return head2;
        }

        public static void main(String[] args) {
            Node a = new Node(3);
            Node b = new Node(6);
            Node c = new Node(9);
            Node d = new Node(4);
            Node e = new Node(5);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            a.random = c;
            b.random = a;
            c.random = d;
            d.random = b;
            e.random = null;
            display(a);
            Node copy = copyRandomList(a);
            display(copy);

        }
    }
