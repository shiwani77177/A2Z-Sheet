import java.util.Scanner;

public class majorityElement {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the size of the array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i < n; i++) {
			  arr[i] = sc.nextInt();
			}

			// Moore Voting Algorithm
			int count = 0;
			int element = 0;
			for (int i = 0; i < n; i++) {
			  if (count == 0) {
			    element = arr[i]; 
			    count = 1;
			  }
			  else if (arr[i] == element) {
			      count++;
			  }
			  else {
			    count--;
			  }
			}
			System.out.println("The element is = " + element);

			//2nd iteration for verification
			int verify = 0;
			for (int i = 0; i < n; i++) {
			  if(arr[i] == element) {
			    verify++;
			  }
			}
			if (verify > (n/2)) {
			  System.out.print("The majority element is = " + element);
			} else {
			  System.out.print("No majority element exists");
			}
		}
  }
}

