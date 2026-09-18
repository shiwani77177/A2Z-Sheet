import java.util.Scanner;

public class numberAppearOnce {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i =0; i < n;i++) {
        arr[i] = sc.nextInt();
      }

      for(int i = 0; i < n;i++) {
        int num = arr[i];
        int count = 0;
        for(int j = 0; j < n;j++) {
          if (arr[j] == num) {
            count++;
          }
        }
        if (count == 1) {
          System.out.println("The number that appears once is = " + num);
        }
      }
    }
  }
  
}

