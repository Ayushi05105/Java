package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class the_celebrityProblem {
    static class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n=mat.length;
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(mat[v1][v2]==1){
                st.push(v2);
            }
            else st.push(v1);
        }
        if(st.size()==0) return -1;
        int potential = st.pop();
        for(int j=0;j<n;j++){
            if(j!= potential && mat[potential][j]==1) return -1;
        }
        for(int i=0;i<n;i++){
            if(i==potential) continue;
            if(mat[i][potential]==0) return -1;
        }
        return potential;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] =sc.nextInt();
            }
        }
        Solution obj = new Solution();
        System.out.println(obj.celebrity(mat));
        
    }
    
}
