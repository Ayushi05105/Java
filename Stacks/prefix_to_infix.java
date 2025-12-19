package Stacks;

import java.util.Stack;

public class prefix_to_infix {

     public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
        if(ascii>=48 && ascii<=57){
            val.push(ch+"");
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }   
        System.out.println(val.peek());   
      }
    
    
}
