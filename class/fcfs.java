public class fcfs {

    public static void main(String[] args) {
        int[] at = {0,1,2,3};
        int n = at.length;
        int[] bt = {8,3,1,2};
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        ct[0] = at[0]+bt[0];
        for(int i =1;i<n;i++){
            ct[i] = Math.max(ct[i-1],at[i]) + bt[i];
        }
        for(int i =0;i<n;i++){
            tat[i] = ct[i]-at[i];
            wt[i] = tat[i]-bt[i];
            System.out.println(ct[i]+" "+ tat[i]+" " + wt[i]);
        }
        
       
        

    }
}
