public class pascalTriangleIII {
  public static void main(String[] args) {
    int n = 6;
    int[][] triangle = generatePascalTriangle(n);
    printPascalTriangle(triangle);
  }

  static int[][] generatePascalTriangle(int n) {
    int[][] triangle = new int[n][];
    for (int i = 0; i < n; i++) {
      triangle[i] = new int[i+1];
      triangle[i][0] = 1;
      triangle[i][i] = 1;
      for (int j = 1; j < i; j++) {
        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
      }
    }
    return triangle;
  }

  private static void printPascalTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
      }
}
}
