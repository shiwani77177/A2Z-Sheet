import java.util.Scanner;

public class kadaneAlgorithm {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      //Kadane Algorithm
      int sum = 0;
      int max = arr[0];
      for (int i = 0; i < n; i++) {
        sum += arr[i];
        max = Math.max(sum,max);
        if (sum < 0) {
          sum = 0;
        }
      }
      System.out.print("The sum of max subarray is = " + max);
    }
  }
}

