import java.util.Scanner;

public class zerosToEnd {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of array: ");
      for(int i = 0;i < n;i++) {
        arr[i] = sc.nextInt();
      }

      int j = -1;
      for(int i = 0;i < n;i++) {
        if(arr[i] == 0) {
          j = i;
          break;
        }
      }

      for(int i = j+1; i < n;i++) {
        if(arr[i] != 0) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          j++;
        }
      }

      System.out.print("The output array is: ");
      for(int i = 0;i < n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }
  
}
