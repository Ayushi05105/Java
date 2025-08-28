package Two_D_Array;

import java.util.Scanner;

import miscProblem.sortArray;

public class Spiral {

    static void printMatrix(int[][] matrix){
        for(int i =0; i<matrix.length ; i++){
            for(int j = 0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void printSpiralOrder(int[][] matrix , int r,int c){
        int topRow =0 , bottomRow = r-1 , leftCol = 0 , rightCol = c-1;
        int totalElement = 0;

        while(totalElement < r * c){
            // topRow -> leftCol to rightCol
            for(int j = leftCol ; j <= rightCol && totalElement < r*c ;j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElement++ ;
            }
            topRow++ ;

            //rightCol -> topRow to bottomCol
            for(int i = topRow ; i <= bottomRow && totalElement < r*c ;i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for(int j = rightCol;j >=leftCol && totalElement < r*c;j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow --;

            //leftCol -> bottomRow to topRow
            for(int i = bottomRow ; i >= topRow  && totalElement < r*c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++ ;
            }
            leftCol ++ ;

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;

        System.out.println("Enter " + total + " values");

        for(int i = 0 ;i<r;i++){
            for(int j = 0; j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiralOrder(matrix, r, c);
    }
    
}
