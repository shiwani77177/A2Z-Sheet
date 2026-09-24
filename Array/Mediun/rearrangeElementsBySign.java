import java.util.Arrays;
import java.util.Scanner;

public class rearrangeElementsBySign {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array(always positive): ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int i = 0;i < n;i++) {
        arr[i] = sc.nextInt();
      }

      //Rearrange
      int ans[] = new int[n];
      int pos = 0;
      int neg = 1;
      for(int i = 0;i < n;i++) {
        if(arr[i] < 0) {
          ans[neg] = arr[i];
          neg += 2;
        } else {
          ans[pos] = arr[i];
          pos += 2;
        }
      }
      System.out.println("The rearranged array is: ");
      System.out.println(Arrays.toString(ans));
    }
  }
}

