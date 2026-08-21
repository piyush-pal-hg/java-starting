import java.util.*;

public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter no. of pattern:");
        int n = sc.nextInt();
        
        System.out.println("enter size of pattern:");
        int m = sc.nextInt();

        switch (n) {
            case 1:
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (i == 1 || i == m || j == 1 || j == m) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= m; i++) {
                    for (int j = i; j <= m; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= n; i++) {
                    //spaces
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    //stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                int num = 1;
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(num+" ");
                        num++;
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}