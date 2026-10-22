
import java.util.Scanner;

public class searchInSortedAraayI {
  public static void main(String[] args) {
      int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6, 7};
      try (Scanner sc = new Scanner(System.in)) {
        int target = sc.nextInt();
      }
      int n = arr.length;
      int low = 0,high = n - 1;

      Solution obj = new Solution();
  }

  static class Solution {
    public int search(int arr[],int n,int target,int low,int high) {
      while(low <= high) {
        int mid = (low + ((high - low)/2));
        if (arr[mid] == target) {
          return mid;
        }

        //Left Sorted
        if (arr[low] <= arr[mid]) {
          if (arr[low] <= target && target <= arr[mid]) {
            high = mid - 1;
          } else {
            low = mid + 1;
          }
        }
        //Right Sorted
        else {
          if (arr[mid] <= target && target <= arr[high]) {
            low = mid + 1;
          } else {
            high = mid - 1;
          }
        }
      }
      return -1;
    }
  }
}


