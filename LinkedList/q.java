package LinkedList;

public class q {
    public static class Node{
        Node next;
        int val;
        Node child ;
        Node(int val){
            this.val = val;
            this.next = null;
            this.child = null;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void insertionAthead(Node head){
        Node temp = head;
        while(temp!=null){
            temp.next = head;
            head = temp;
        }
    }

    public static boolean cycle(Node head){
        Node slow = null;
        Node fast = null;
        if(head == null && head.next==null) return false;
        while(fast!=null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static Node cycleNode(Node head){
        Node slow = null;
        Node fast = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        Node temp = head;
        if(fast == null && fast.next==null) return null;
        while(temp!=slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    public static Node oddEven(Node head){
        Node odd = head;
        Node oddHead = odd;
        Node even = head.next;
        Node evenHead = even;
        while(even!=null &&even.next!=null){
            odd.next= odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next.next;
        }
        odd.next = evenHead;
        return oddHead;
    }
    public static Node removeNthFromEnd(Node head,int n){
        Node temp = new Node(0);
        temp.next = head;
        Node fast = temp;
        Node slow = temp;
        for(int i =1;i<=n+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next!=null) slow.next = slow.next.next;
        return temp;
    }
    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next==null) return null;
        slow.next = slow.next.next;
        return head;
    }
    public static Node mergeTwosortedList(Node head1,Node head2){
        Node t1 = new Node(0);
        Node t2 = new Node(0);
        t1 = head1;
        t2 = head2;
        Node h= new Node(100);
        Node t = h;
        while(t1!= null && t2 !=null){
            if(t1.val<t2.val){
                t1.next = t2;
                t = t1;
                t1 = t1.next;
            }else{
                t2.next = t1;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){
            t.next = t2;
        }
        if(t2 == null){
            t.next = t1;
        }
        return h.next;
    }
    
// sort list
    private Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node sortList(Node head) {
        if(head == null || head.next == null) return head;
        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;
        left = sortList(left);
        right = sortList(right);
        return mergeTwosortedList(left,right);
    }
    public static Node sortList012(Node head){
        Node temp = head;
        Node h1 = new Node(-1);
        Node temp1 = h1;
        Node h2 = new Node(-1);
        Node temp2 = h2;
        Node h3 = new Node(-1);
        Node temp3 = h3;
        while(head!=null){
            if(head.val == 0){
                h1.next = head;
                head = head.next;
            }
            if(head.val == 1){
                h2.next = head;
                head = head.next;
            }
            else{
                h3.next = head;
                head = head.next;
            }
            h1.next = h2;
            h2.next = h3;
        }
        return temp.next;
    }
    public static Node getIntesectionNode(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int length1 =0;
        while(temp1!=null){
            length1++;
            temp1 = temp1.next;
        }
        int length2 =0;
        while(temp2!= null){
            length2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if(length1>length2){
            int step = length1-length2;
            for(int i =1;i<=step;i++){
                temp1 = temp1.next;
            }
        }else{
            int step = length2-length1;
            for(int i =1;i<=step;i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static int helper(Node temp){
        if(temp==null){
            return 1;
        }
        int carry = helper(temp.next);
        temp.val = carry;
        if(temp.val<10) return 0;
        temp.val =0;
        return 1;
    }
    public static Node addOne(Node head){
        int carry = helper(head);
        if(carry == 1){
            Node newNode = new Node(1);
            head = newNode;
        }
        return head;
    }


    // reverse kth node of list
    public Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public Node getKthNode(Node temp,int k){
        k -=1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node kthNode = getKthNode(temp,k);
            if(kthNode == null){
                if(prev!=null) prev.next = temp;
                break;
            }
            Node after = kthNode.next;
            kthNode.next = null;
            reverseList(temp);
            if(temp == head){
                head = kthNode;
            }else{
                prev.next = kthNode;
            }
            prev = temp;
            temp = after;
        }
        return head;
    }

//rotate right
    public Node findNthNode(Node temp,int k){
        int cnt = 1;
        while(temp!=null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
    public Node rotateRight(Node head, int k) {
        if(head == null || k ==0) return head;
        Node tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len+=1;
        }
        if(k%len == 0) return head;
        k = k % len;
        tail.next = head;
        Node newLastNode =findNthNode(head,len-k);
        head = newLastNode.next;
        newLastNode.next = null; 
        return head;
    }

    // flatten the linked list
    public static Node merge(Node list1,Node list2){
        Node dummy = new Node(-1);
        Node res = dummy;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                res.child = list1;
                res = list1;
                list1 = list1.child;
            }
            else{
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }
        if(list1!=null) res.child = list1;
        else res.child = list2;
        if(dummy.child!=null) dummy.child.next = null;
        return dummy.child;
    }
    public static Node flattenLinkedList(Node head){
        if(head == null || head.next == null) return head;
        Node mergeHead = flattenLinkedList(head.next);
        head = merge(head,mergeHead);
        return head;
    }
}

