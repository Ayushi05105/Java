package Stacks;

public class ImplementationArray {

    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 1;
        void push(int x){
            if(isfull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx-1];
            idx--;
            return top;
        }
        void display(){
            for(int i=1;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }
        boolean isfull(){
            if(idx == arr.length) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.display();
        st.push(9);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(7);
        st.display();
    }
    
}
