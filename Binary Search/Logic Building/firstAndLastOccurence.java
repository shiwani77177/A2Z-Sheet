import java.util.Scanner;

public class firstAndLastOccurence {
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 8, 11, 13};
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the target: ");
      int target = sc.nextInt();
      int n = arr.length;
      int low = 0, high = n - 1;

      Solution obj = new Solution();
      int first = obj.lowerbd(arr, low, high, target, n);

      if (first == n || arr[first] != target) {
        System.out.println("Target not found in the array.");
      } else {
        int last = obj.upperbd(arr, low, high, target, n) - 1;
        System.out.println("The first occurrence is at index = " + first);
        System.out.println("The last occurrence is at index = " + last);
      }
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

