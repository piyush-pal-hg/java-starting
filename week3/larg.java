package week3;
import java.util.Scanner;

public class larg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int choice;

        if (n > m) {
            choice = 1;
        }
        else if (n < m) {
            choice = 2;
        }
        else {
            choice = 3;
        }

        switch (choice) {
            case 1:
                System.out.println(n + " IS GREATER THAN " + m);
                break;

            case 2:
                System.out.println(n + " IS LESS THAN " + m);
                break;

            case 3:
                System.out.println(n + " IS EQUAL TO " + m);
                break;

            default:
                System.out.println("Invalid output");
                break;
        }

        sc.close();
    }
}