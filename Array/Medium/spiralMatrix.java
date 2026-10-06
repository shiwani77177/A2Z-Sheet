import java.util.Scanner;

public class spiralMatrix {
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

			//Spiral order
			int top = 0, right = m-1;
			int left = 0, bottom = n-1;
			while (top <= bottom && left <= right) {
			  for (int i = left; i <= right; i++) {
			    System.out.print(matrix[top][i] + " ");
			  }
			  top++;
			  for(int i = top; i <= bottom; i++) {
			    System.out.print(matrix[i][right] + " ");
			  }
			  right--;
			  //Because top and bottom both have changed so we need to check
			  if (top <= bottom) {
			    for (int i = right; i >= left; i--) {
			      System.out.print(matrix[bottom][i] + " ");
			    }
			  }
			  bottom--;
			  if (left <= right) {
			    for (int i = bottom; i >= top; i--) {
			      System.out.print(matrix[i][left] + " ");
			    }
			  }
			  left++;
			}
		}
  }
}


