import java.sql.Array;
import java.util.*;

public class scanner_demo{
    public static void main(String[] args){
        System.out.println("Enter an array");

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}




