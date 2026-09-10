import java.util.*;
public class zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("ENTER 10 ELEMENTS");
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0; i< 10; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<10){
            arr[j] = 0;
            j++;
        }
        System.out.println("ARRAY AFTER MOVING ZEROS");
        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
