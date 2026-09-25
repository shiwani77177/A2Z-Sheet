import java.util.Scanner;

public class leftRotateDPlaces {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int i = 0;i < n;i++) {
        arr[i] = sc.nextInt();
      }

      int d = 3;
      int[] temp = {1,2,3};

      //Shifting
      for (int i = d;i < n;i++) {
        arr[i - d] = arr[i];
      }
      //Puting temp in back
      for(int i = n-d;i < n;i++) {
        arr[i] = temp[i - (n-d)];
      }

      //Printing the rotayed array
      System.out.println("The rotated array is = ");
      for ( int i = 0;i < n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }
}