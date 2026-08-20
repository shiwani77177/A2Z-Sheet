import java.util.Scanner;

public class removeDuplicates {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int i = 0;i < n;i++) {
        arr[i] = sc.nextInt();
      }

      //Removing Duplicates
      int i = 0;
      for(int j = 1;j < n;j++) {
        if(arr[j] != arr[i]) {
          arr[i+1] = arr[j];
          i++; 
        }
      }
      System.out.println("Size of the array is = " + (i+1));
    }
  }
}