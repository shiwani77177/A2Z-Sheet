import java.util.Scanner;

public class PascalElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter row (n): ");
            int n = sc.nextInt();
            
            System.out.print("Enter column (r): ");
            int r = sc.nextInt();
            
            if (r > n || r < 0) {
                System.out.println("Invalid column! Column must be between 0 and row (n).");
            } else {
                int element = NCr(n, r);
                System.out.println("The element at row " + n + ", column " + r + " is: " + element);
            }
        }
    }
    
    // NCr method to calculate the binomial coefficient directly
    public static int NCr(int n, int r) {
        if (r > n - r) {
            r = n - r; 
        }
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}

