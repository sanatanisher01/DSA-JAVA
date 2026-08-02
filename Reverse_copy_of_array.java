// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Reverse_copy_of_array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
