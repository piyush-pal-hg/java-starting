package week3;
import java.util.*;
public class age{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("ENTER THE AGE: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}