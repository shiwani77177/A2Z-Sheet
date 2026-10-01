import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class longestConsecutiveSequence {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < n;i++) {
        arr[i] = sc.nextInt();
      }

      //Algorithm
      int longestStreak = 1;
      Set<Integer> set = new HashSet<>();
      for (int num: arr) {
        set.add(num);
      }

      for (int num: arr) {
        if (!set.contains(num - 1)) {
          int currentNum = num;
          int currentStreak = 1;

          while (set.contains(currentNum + 1)) {
            currentNum += 1;
            currentStreak += 1;
          }

          longestStreak = Math.max(longestStreak, currentStreak);
        }
      }
      System.out.println("Length of the longest consecutive sequence: " + longestStreak);
    }
  }
  
}
