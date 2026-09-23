import java.util.Scanner;

public class buyAndSell {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the no of days: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the prize of the stocks: ");
        for (int i = 0;i < n;i++) {
          arr[i] = sc.nextInt();
        }

        // Algorithm
        int min = arr[0];
        int profit = 0;
        for (int i = 0; i < n;i++) {
          int cost = arr[i] - min;
          profit = Math.max(profit, cost);
          min = Math.min(min, arr[i]);
        }
        System.out.println("The profit is = " + profit);
      }
  }
}
