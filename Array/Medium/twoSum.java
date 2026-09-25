import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the target sum: ");
            int target = sc.nextInt();

            Arrays.sort(arr);
            int left = 0;
            int right = n - 1;
            boolean found = false;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("The two numbers are " + arr[left] + " and " + arr[right]);
                    found = true;
                    break; 
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            if (!found) {
                System.out.println("No two numbers found to make the target sum");
            }
        }
    }
}

