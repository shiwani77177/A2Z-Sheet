import java.util.Scanner;

public class secondLargestElement {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++) {
          arr[i] = sc.nextInt();
        }

        //Largest
        int largest = arr[0];
        for(int i = 0;i < n;i++) {
          if(arr[i] >= largest) {
            largest = arr[i];
          }
        }

        //Second Largest
        int secondLargest = -1;
        for(int i = 0;i<n;i++) {
          if(arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
          }
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Second largest element is: " + secondLargest);
      }
  }
}
