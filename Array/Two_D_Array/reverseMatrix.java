package Two_D_Array;

import java.util.Scanner;

public class reverseMatrix {

    static void printArray(int[][] matrix){
        for(int i = 0;i<matrix.length ; i++){
            for(int j = 0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void reverseMatrix(int[][] matrix){
        for(int i = 0 ;i<matrix.length ; i++){
            reverseArray(matrix[i]);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        int totalElement = r * c ;
        System.out.println("Enter " + totalElement + " values");
        for(int i =0; i< r ; i++){
            for(int j = 0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        reverseMatrix(matrix);
        System.out.println("Reverse matrix :");
        printArray(matrix);


    }
    
}
