import java.util.*;
public class searchi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("ENTER 10 ELEMENTS");
        for( int i =0 ;i < 10 ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int S = sc.nextInt();
        for(int i=0; i < 10; i++){
            if (arr[i]==S){
                System.out.println("ELEMENT FOUND: " + arr[i]);
                return;
            }
        }
        System.out.println("ELEMENT NOT FOUND");
        }    
    }