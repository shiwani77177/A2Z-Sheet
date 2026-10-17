import java.util.Scanner;

public class lowerBound {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the target: ");
      int target = sc.nextInt();
      int n = arr.length;
      int low = 0, high = n - 1;

      Solution obj = new Solution();
      System.out.println("The lower bound is index = " + obj.lowerbd(arr, low, high, target, n));
    }
  }

  static class Solution {
    public int lowerbd(int[] arr, int low, int high, int target, int n) {
      int ans = n;
      while (low <= high) {
        int mid = (low + (high - low)/2); 
        if (arr[mid] >= target) {
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

