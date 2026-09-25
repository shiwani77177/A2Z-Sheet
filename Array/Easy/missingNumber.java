import java.util.Scanner;

public class missingNumber {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the size of array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the elements of array: ");
			for (int i = 0; i < n; i++) {
			  arr[i] = sc.nextInt();
			}

			int totalSum = (n * (n+1))/ 2;
			int sum2 = 0;
			for (int i = 0; i < n-1; i++) {
			  sum2 += arr[i];
			}
			System.out.println("The missing number is: " + (totalSum - sum2));
		}
  }
}
