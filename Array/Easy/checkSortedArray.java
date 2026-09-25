import java.util.Scanner;

public class checkSortedArray {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of array: ");
      for(int i = 0; i < n;i++) {
        arr[i] = sc.nextInt();
      }

    //Sorted
    boolean isSorted = true;
      for(int i = 0; i < n;i++) {
        if(arr[i] >= arr[i-1]) {
          isSorted = true;
          break;
        }
      }
      if(isSorted) {
        System.out.println("The array is sorted.");
      } else {
        System.out.println("The array is not sorted.");
      }
    }
  }
}


  
