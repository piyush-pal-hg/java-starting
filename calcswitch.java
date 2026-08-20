import java.util.*;

public class calcswitch {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Element:");
        int a = sc.nextInt();
        System.out.println("Enter operator:");
        char op = sc.next().charAt(0);
        System.out.println("Enter second Element:");
        int b = sc.nextInt();
        switch(op){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}