package week3;
import java.util.*;
public class loopswithswitch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("1. For Loop");
        System.out.println("2. While Loop");
        System.out.println("3. Do-While Loop");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;

        switch (choice) {

            case 1:
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial = " + fact);
                break;

            case 2:
                int i = 1;
                while (i <= n) {
                    fact = fact * i;
                    i++;
                }
                System.out.println("Factorial = " + fact);
                break;

            case 3:
                int j = 1;
                do {
                    fact = fact * j;
                    j++;
                } while (j <= n);

                System.out.println("Factorial = " + fact);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}