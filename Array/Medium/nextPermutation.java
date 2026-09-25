import java.util.Arrays;
import java.util.Scanner;

public class nextPermutation {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i < n;i++) {
          arr[i] = sc.nextInt();
        }

        //Finding Break-point
        int index = -1;
        for(int i = n-2;i > 0;i--) {
          if (arr[i] < arr[i+1]) {
            index = i;
            break;
          }
        }

        //Finding the smallest one but the closest
        for (int i = n-1;i > index;i--) {
          if (arr[i] > arr[index]) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            break;
          }
        }

        //Reverse for sorted order
        int left = index + 1;
        int right = n - 1;
        while (left < right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
        }

        //Printing the permutation
        System.out.println("The next permutation is: ");
        System.out.println(Arrays.toString(arr));
      }
  }

}
