import java.util.Scanner;

public class unionTwoSortedArray {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the first array: ");
      int n = sc.nextInt();
      System.out.print("Enter the size of the second array: ");
      int m = sc.nextInt();

      int[] arr1 = new int[n];
      System.out.println("Enter the elements of the first array: ");
      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
      }

      int[] arr2 = new int[m];
      System.out.println("Enter the elements of the second array: ");
      for (int i = 0; i < m; i++) {
        arr2[i] = sc.nextInt();
      }

      int[] union = new int[n + m];
      int i = 0, j = 0, k = 0;

      while (i < n && j < m) {
        if (arr1[i] <= arr2[j]) {
          if (k == 0 || union[k - 1] != arr1[i]) {
            union[k++] = arr1[i];
          }
          if (arr1[i] == arr2[j]) {
            j++; // Skip duplicate in second array
          }
          i++;
        } else {
          if (k == 0 || union[k - 1] != arr2[j]) {
            union[k++] = arr2[j];
          }
          j++;
        }
      }

      // Remaining elements of arr1
      while (i < n) {
        if (k == 0 || union[k - 1] != arr1[i]) {
          union[k++] = arr1[i];
        }
        i++;
      }

      // Remaining elements of arr2
      while (j < m) {
        if (k == 0 || union[k - 1] != arr2[j]) {
          union[k++] = arr2[j];
        }
        j++;
      }

      System.out.println("Union of both the arrays is: ");
      for (int l = 0; l < k; l++) {
        System.out.print(union[l] + " ");
      }
    }
  }
}

