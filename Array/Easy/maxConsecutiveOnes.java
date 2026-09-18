import java.util.Scanner;

public class maxConsecutiveOnes {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of array: ");
      for(int i = 0; i < n;i++) {
        arr[i] = sc.nextInt();
      }

      //Consecutive Ones
      int max = 0;
      int count = 0;
      for(int i = 0; i < n;i++) {
        if (arr[i] == 1) {
          count++;
          if (count > max) {
            max = count;
          }
        } else {
          count = 0;
        }
      }
      System.out.println("Maximum consecutive ones are = " + max);
    }
  }
  
}

