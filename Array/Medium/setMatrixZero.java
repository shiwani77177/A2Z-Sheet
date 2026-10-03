import java.util.Scanner;

public class setMatrixZero {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of rows: ");    // (n*n matrix)
      int n = sc.nextInt();
      System.out.print("Enter the number of columns: ");
      int m = sc.nextInt();
      int[][] matrix = new int[n][m];
      System.out.println("Enter the elements of the matrix: ");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          matrix[i][j] = sc.nextInt(); 
        }
      }

          System.out.println("\nThe Matrix is:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " "); 
                }
                System.out.println(); 
            }

      //Algorithm
      int col0 = 1;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m;j++) {
          if (matrix[i][j] == 0) {
            matrix [i][0] = 0;   // mark ith row
            if (j != 0) {   
              matrix[0][j] = 0;    // mark jth column
            }
            else {
              col0 = 0;
            }
          }
        }
      }

      for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
          if (matrix[i][j] != 0) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
              matrix[i][j] = 0;
            }
          }
        }
      }

      if (matrix[0][0] == 0) {
        for (int j = 0; j < m; j++) {
          matrix[0][j] = 0;
        }
      }

      if (col0 == 0) {
        for (int i = 0; i < n; i++) {
          matrix[i][0] = 0;
        }
      }

      //Printing the matrix
      System.out.println("The modified matrix is: ");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }

    }
}

