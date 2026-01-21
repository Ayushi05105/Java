package LinkedList;
public class intersectionOf2LL {

    public static Node common(Node headA,Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int lengthA =0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB =0;
        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
            }
            tempA = headA;
            tempB = headB;
            if(lengthA> lengthB){
                int steps = lengthA-lengthB;
                for(int i =1;i<=steps;i++){
                    tempA = tempA.next;
                }
            }
            else{
                int steps = lengthB - lengthA;
                for(int i=1;i<=steps;i++){
                    tempB = tempB.next;
                }
            }
            while(tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;
    }
    
    

    public static void displayLL(Node head){
        Node  temp=head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(9);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
       // Node f = new Node(6); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //e.next = f;
        Node x = new Node(3);
        Node y = new Node(2);
        Node z = new Node(4);
        //Node u = new Node(34);
        //Node v = new Node(6);
        x.next = y;
        y.next = z;
        z.next = c;
     //   z.next = u;
       // u.next = v;         
        displayLL(a);
        displayLL(x);
        Node m = common(a, x);
        if(m != null){
            System.out.println("Intersection " + m.data);
        }
        else{
            System.out.println("no intersection.");
        }
    }
    
}
