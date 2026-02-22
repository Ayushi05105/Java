package LinkedList;

public class reverseDll {
    public static class Node{
        Node next;
        int data;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public static Node reverseDLL(Node head) {
        Node curr = head;
        Node temp = null;
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp!=head){
            head = temp.prev;
        }
        return head;
    }
    
}
