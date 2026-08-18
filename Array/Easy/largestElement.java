import java.util.Scanner;

public class largestElement {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0;i <n;i++) {
        arr[i] = sc.nextInt();
      }
      int largest = arr[0];
      for (int i = 0;i < n;i++) {     //Traversal in the array
        if (arr[i] >= largest) {
          largest = arr[i];
        }
      }
      System.out.println("The largest element in the array is: " + largest);
    }
  }
}