package Recursion.Day3;

public class SubsetSum {
    static void sumSubset(int[] a,int n,int idx,int sum){
        if(idx >= n){
            System.out.println(sum);
            return;
        }
        sumSubset(a, n, idx+1, sum);
        sumSubset(a, n, idx+1, sum + a[idx]);
    }

    public static void main(String[] args) {
        int[] a ={2,4,5};
        sumSubset(a, a.length, 0, 0);
    }
    
}
