import java.util.Scanner;

public class leftRotateOnePlace {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int i = 0;i < n;i++) {
        arr[i] = sc.nextInt();
      }

      //Rotation
      int temp = arr[0];
      for(int i = 1;i < n;i++) {
        arr[i-1] = arr[i];
      }
      arr[n-1] = temp;

      //Printing the rotated array
      System.out.print("The rotated array is = ");
      for(int i = 0;i < n;i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
}