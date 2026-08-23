import java.util.*;

public class conditions {

     public static void main(String[] args){

        //input from user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Element:");
        int a = sc.nextInt();
        System.out.println("Enter second Element:");
        int b = sc.nextInt();
        System.out.println("Enter third element");
        int c = sc.nextInt();

        //conditional statements

        if(a > b){
            if(a>c){
                 System.out.println("a is largest "+a);
            }
            else{
                System.out.println("c is largest "+c);
            }
        }
        else{
            if(b > a){
                if(b>c){
                    System.out.println("b is largest "+b);
                }
                else{
                    System.out.println("c is largest "+c);
                }
            }
            else{
                System.out.println("all are equal "+(a=b=c));
            }
        }
    }
}
