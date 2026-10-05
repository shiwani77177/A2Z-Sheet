import java.util.Scanner;

public class reverseMatrix {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of rows: ");   // (n*n matrix)
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

      System.out.println("\nThe matrix is: ");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m;j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }

      //Transposing the matrix
      for (int i = 0; i < n; i++) {
        for (int j = i+1; j < m; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      }

      //Reversing the matrix
      for (int i = 0; i < n; i++) {
        int left = 0;
        int right = n-1;
        while (left < right) {
          int temp = matrix[i][left];
          matrix[i][left] = matrix[i][right];
          matrix[i][right] = temp;
          left++;
          right--;
        }
      }

      System.out.println("\nThe reversed matrix is: ");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m;j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }

  }
}

