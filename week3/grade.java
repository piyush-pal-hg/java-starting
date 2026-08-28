package week3;
import java.util.*;
public class grade {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("ENTER THE MARKS: ");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else if(marks >= 90 && marks<=100){
            System.out.println("A");
        }
        else if(marks >= 80){
            System.out.println("B");
        }
        else if(marks >= 70){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}
