import java.util.Arrays;

public class sjf {
    public static void main(String[] args) {
         int[] at = {0,0,0,0};
        int n = at.length;
        int[] bt = {8,3,1,2};
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];
        Arrays.sort(bt);
        for(int i =1;i<n;i++){
            wt[i] = wt[i-1]+bt[i-1];
        }
        for(int i =0;i<n;i++){
         tat[i] = wt[i] + bt[i];
         System.out.println(wt[i]+" " + tat[i]);
        }
    }
    
}
