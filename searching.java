package twoDarray;

import java.util.*;

public class searching {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER ROWS :");
      int n = sc.nextInt();
      System.out.println("ENTER COLUMNS :");
      int m = sc.nextInt();

      System.out.println("MAMTRIX ELEMENTS : ");
      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }
      System.out.println("OUTPUT MATRIX :");
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
      }
      System.out.println("FIND NO. LOCATION :");
      int x = sc.nextInt();
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
            if(matrix[i][j] == x){
                System.out.println(" LOCATION IS :" + i + " , "+j);
            }
           }
      }
    }
}