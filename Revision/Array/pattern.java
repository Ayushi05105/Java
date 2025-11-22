public class pattern {

    static void squarePattern(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    static void leftTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int n){
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-1;j++){
                System.out.println("");
            }
            for(int j=1;j<2*i-1;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    static void Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-1;j++){
                System.out.println(" ");
            }
            for(int j=1;j<=2*i-1;j++){
            System.out.print("* ");
        }
    }
    System.out.println();
    }
    static boolean condition(int x,int y,int n){
        return (Math.abs(x)+Math.abs(y)) > n-1;
    }
    static void diamond(int n){
        for(int y=n-1;y>=-1*(n-1);y--){
            for(int x =-1*(n-1);x<=(n-1);x++){
                if(condition(x,y,n)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        //squarePattern(4,4);
        //leftTriangle(4);
       // Triangle(4);
        //rightTriangle(4);
        diamond(5);
}
}
    

