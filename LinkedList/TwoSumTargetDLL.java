package LinkedList;

public class TwoSumTargetDLL {

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node[] twoSum(Node head,int target){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        while(head.val< temp.val){

            int sum = head.val + temp.val;
            if(sum == target){
                return new Node[]{head,temp};

            }
            else if(sum > target){
                temp = temp.prev;
            }
            else{
                head = head.next;
            }
        }
        return null;
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
        Node a = new Node(3);
        Node b = new Node(10);
        Node c = new Node(24);
        Node d = new Node(27);
        Node e = new Node(69);
        Node f = new Node(98);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        Node[] ans = twoSum(a, 30);
        if(ans != null){
            System.out.println(ans[0].val +" "+ ans[1].val);
        }
        else{
            System.out.println("No pair found");
        }
}
}
