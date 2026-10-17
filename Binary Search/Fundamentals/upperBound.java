import java.util.Scanner;

public class upperBound {
  public static void main(String[] args) {
    int arr[] = {2, 3, 6, 7, 8, 8, 11, 11, 11, 12};
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the target: ");
      int target = sc.nextInt();
      int n = arr.length;
      int low = 0, high = n - 1;

      Solution obj = new Solution();
      System.out.println("The upper bound is index = " + obj.upperbd(arr, low, high, target, n));
    }
  }

  static class Solution {
    public int upperbd(int[] arr, int low, int high, int target, int n) {
      int ans = n;
      while (low <= high) {
        int mid = (low + (high - low)/2); 
        if (arr[mid] > target) {
          ans = mid;
          high = mid - 1;
        }
        else {
          low = mid + 1;
        }
      }
      return ans;
    }
  }
}

