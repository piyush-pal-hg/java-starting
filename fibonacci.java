import java.util.*;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // First two Fibonacci numbers
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        // Loop
        for (int i = 1; i <= n; i++) {

            // Print first number
            System.out.print(first + " ");

            // Calculate next number
            int next = first + second;

            // Move numbers forward
            first = second;
            second = next;
        }

        sc.close();
    }
}
