import java.util.Arrays;
import java.util.Scanner; // Required for Arrays.toString()

public class sortArrayOfZeroOneTwo {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of array: ");
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      // Dutch National Flag Algorithm
      int low = 0;
      int mid = 0;
      int high = n - 1;

      while (mid <= high) {
        if (arr[mid] == 0) {
          int temp = arr[low];
          arr[low] = arr[mid];
          arr[mid] = temp;
          low++;
          mid++;
        } else if (arr[mid] == 1) {
          mid++;
        } else {
          int temp1 = arr[mid];
          arr[mid] = arr[high];
          arr[high] = temp1;
          high--;
        }
      }
      System.out.println("Sorted array: " + Arrays.toString(arr));
    }
  } 
}


