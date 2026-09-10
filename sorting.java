import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        System.out.println("ENTER 10 ELEMENTS");
        for( int i =0 ;i < 10 ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i< 10; i++){
            for(int j= i+1; j< 10;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("ASCENDING ORDER:");
        for(int i = 0; i< 10; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i< 10; i++){
            for(int j= i+1; j< 10;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nDESCENDING ORDER:");
        for(int i = 0; i< 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
