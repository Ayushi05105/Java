package LinkedList;

public class implementation {


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size =0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head ==null){
                head = temp;
            }
            else{
                tail.next=temp;
            }
            tail = temp;
            size++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){   //empty
                //head = tail = temp;
                insertAtEnd(val);
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtIndex(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size){
                insertAtEnd(val);
                return;
            }
            else if(idx == 0 ){
                insertAtEnd(val);
                return;
            }
            else if(idx <0 || idx >size){
                System.out.println("wrong index");
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx){
            if(idx<0 || idx > size){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp =temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp = head;
            if(idx == 0) head = head.next;
            if(idx == size-1) tail =temp;
            for(int i = 1;i<= idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtHead(7);
        ll.insertAtEnd(2);
        ll.display();
        System.out.println(ll.getAt(2));
        ll.deleteAt(2);
        ll.display();
    }
    
}
