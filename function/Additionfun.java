package function;
import java.util.*;

public class Additionfun{
    public static int addition(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter second number:");
        int b = sc.nextInt();
        
        int sum = addition(a,b);

        System.out.println("sum of two numbers is: "+sum);
    }
}