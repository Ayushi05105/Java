public class llbasic {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
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
        public static void insertionAtHead(Node head){
            if(head == null) return;
            while(head != null){
                Node temp = head;
                temp.next = head;
                head = temp;
            }
        }
       
    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println(size(a));

        
    }
    
}
