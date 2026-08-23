package function;
import java.util.*;

public class multi{

    public static int multiplication(int a, int b){

        int mult= a*b;
        return mult;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter second number:");
        int b = sc.nextInt();

        int mult = multiplication(a,b);
        System.out.println("multiplication of two numbers is: "+mult);
    }

}
