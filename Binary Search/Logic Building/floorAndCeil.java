import java.util.Arrays;

public class floorAndCeil {
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50};
    int target = 25;
    int n = arr.length;
    int low = 0, high = n - 1;

    Solution obj = new Solution();
    int[] result = obj.floorCeil(arr, low, high, target, n);
    System.out.println("The floor and ceil is = " + Arrays.toString(result));
  }

  static class Solution {
    public int[] floorCeil(int[] arr, int low, int high, int target, int n) {
      int originalLow = low;
      int originalHigh = high;

      int floor = -1;
      while (low <= high) {
        int mid = low + (high - low) / 2; 
        if (arr[mid] <= target) {
          floor = arr[mid];
          low = mid + 1; 
        } else {
          high = mid - 1;
        }
      }

      low = originalLow;
      high = originalHigh;

      int ceil = -1;
      while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] >= target) {
          ceil = arr[mid];
          high = mid - 1; // look on the left for a closer ceil
        } else {
          low = mid + 1;
        }
      }

      return new int[] {floor, ceil};
    }
  }
}

