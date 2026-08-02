// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //check if array is sorted;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        boolean ans = true;
        for(int i = 0; i<n-1 ; i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            else{
                ans = false;
            }
        }
        if(ans){
            System.out.print("Sorted");
        }
        else{
            System.out.print("Not Sorted");
        }
    }
}
