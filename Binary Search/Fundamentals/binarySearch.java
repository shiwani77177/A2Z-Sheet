public class binarySearch {
  public static void main(String[] args) {
    int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
    int target = 13;
    int n = arr.length;
    int low = 0, high = n - 1;

    Solution obj = new Solution();
    System.out.println(obj.searchInSortedArray(arr, low, high, target));   
  }

  static class Solution {
    public int searchInSortedArray(int[] arr,int low,int high,int target) {
      if (low > high) {
        return -1;
      } 
      int mid = low + ((high - low)/2);
      if (arr[mid] == target) {
        return mid;
      } else if (target > arr[mid]) {
        return searchInSortedArray(arr,mid+1,high,target);
      }
      return searchInSortedArray(arr,low,mid-1,target);
    } 
  }
}


