import java.util.*;

public class conditions {

     public static void main(String[] args){

        //input from user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Element:");
        int a = sc.nextInt();
        System.out.println("Enter second Element:");
        int b = sc.nextInt();

        //conditional statements

        if(a > b){
            System.out.println("a is greater than b");
        }
        else{
            if(a < b){
            System.out.println("a is less than b");
            }
            else{
                System.out.println("a is equal to b");
            }
        }
    }
}
